package com.mujeeb.mosquedashboard.service;

import com.google.api.client.util.Lists;
import com.mujeeb.mosquedashboard.beans.BaseException;
import com.mujeeb.mosquedashboard.beans.OccasionBean;
import com.mujeeb.mosquedashboard.entity.User;
import com.mujeeb.mosquedashboard.entity.Product;
import com.mujeeb.mosquedashboard.entity.Listing;
import com.mujeeb.mosquedashboard.entity.ExchangeRequest;
import com.mujeeb.mosquedashboard.repository.*;
import com.mujeeb.mosquedashboard.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class MasjidService {

    public static final String KEY_HIJRI_ADJUSTMENT = "HIJRI_ADJUSTMENT";
    public static final String KEY_MASJID_ID = "MASJID_ID";
    public static final String KEY_MASJID_NAME = "MASJID_NAME";

    @Autowired
    private MasjidRepository masjidRepository;

    @Autowired
    private NamazTimeRepository namazTimeRepository;

    @Autowired
    private NoticeRepository noticeRepository;

    @Autowired
    private OccasionRepository occasionRepository;

    @Autowired
    private QuranAyatRepository quranAyatRepository;

    @Autowired
    private RamzanTimeRepository ramzanTimeRepository;

    public User authenticateUser(int masjidId, String password) throws BaseException {

        if(password == null || password.isEmpty()) {

            throw new BaseException(12);
        }

        User masjid = null;
        try {
            masjid = masjidRepository.findById(masjidId);

        } catch (Exception e) {

            e.printStackTrace();
            throw new BaseException(14);
        }

        if(masjid == null) {

            throw new BaseException(14);
        } else {

            if(password.equals(masjid.getPassword())) {
                return masjid;
            } else {
                throw new BaseException(14);
            }
        }
    }

    public String getMasjidName(int masjidId) {
        return masjidRepository.findById(masjidId).getDescription();
    }

    public Map<String, String> getNamazTimes(int masjidId) {

        return convertToMap(namazTimeRepository.findByMasjidId(masjidId).stream().collect(Collectors.toList()));
    }

    public List<Listing> getOccasions(int masjidId) {

        return occasionRepository.findByMasjidId(masjidId);
    }

    public List<String> getMasjidList() {

        return Lists.newArrayList(masjidRepository.findAll()).stream()
                .map(masjid -> masjid.getDescription()).collect(Collectors.toList());
    }

    public User findMasjidByMasjidId(int masjidId) {

        return masjidRepository.findById(masjidId);
    }

    public ExchangeRequest getRamzanTime(int masjidId) {
	   	try {
	   		int currentDate = new GregorianCalendar().get(Calendar.DATE);
	   		return ramzanTimeRepository.findByDateAndMasjidId(currentDate, masjidId);

		} catch (Exception e) {
			e.printStackTrace();
		}

	   	return null;
   }

    public int getHijriAdjustment(int masjidId) {

        Map<String,String> times = getNamazTimes(masjidId);
        try {
            return Integer.parseInt(getNamazTimes(masjidId).get(KEY_HIJRI_ADJUSTMENT));

        }catch(Exception ex) {

            return 0;
        }
    }

    public String getCurrentOccasion(int masjidId, boolean isPostMagrib) {
        Date date = isPostMagrib ? DateUtil.addDaysToDate(new Date(), 1) : new Date();
        Calendar currentDate = new GregorianCalendar();
        currentDate.setTime(date);
        try {
            List<Listing> occasions = occasionRepository.findByMasjidId(masjidId);
            for(Listing occasion : occasions) {
                Calendar occasionDate = new GregorianCalendar();
                occasionDate.setTime(occasion.getDate());

                if(currentDate.get(Calendar.DATE) == occasionDate.get(Calendar.DATE)
                        && currentDate.get(Calendar.MONTH) == occasionDate.get(Calendar.MONTH)) {
                    return occasion.getDescription();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean updateNamazTime(int masjidId, String name, String time) throws BaseException {
        try {
            Product namazTime = namazTimeRepository.findByNameAndMasjidId(name, masjidId);
            namazTime.setTime(time);
            namazTimeRepository.save(namazTime);
            return true;

        } catch (Exception e) {

            e.printStackTrace();
            throw new BaseException(-1);
        }
    }

    public boolean updateRefreshRequired(int masjidId, boolean refreshRequired) throws BaseException {

        try {
            return updateNamazTime(masjidId, "REFRESH_REQUIRED", refreshRequired ? "true" : "false");

        } catch (Exception e) {
            return false;
        }
    }

    public String addOccasion(int masjidId, Date occasionDate, String description) {

        try {
            return "" + occasionRepository.save(new Listing(description, occasionDate, masjidId)).getId();

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }

    public boolean deleteOccasion(int index) {

        try {
            occasionRepository.deleteById((long) index);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private Map<String, String> convertToMap(List<Product> beans) {

        return beans.stream().collect(
                Collectors.toMap(
                        namazBean -> namazBean.getName(), namazBean -> namazBean.getTime()));
    }
}
