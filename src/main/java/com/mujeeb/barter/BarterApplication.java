package com.mujeeb.barter;

import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ResourceLoader;

import com.mujeeb.barter.entity.City;
import com.mujeeb.barter.entity.Country;
import com.mujeeb.barter.entity.State;
import com.mujeeb.barter.entity.Unit;
import com.mujeeb.barter.repository.CityRepository;
import com.mujeeb.barter.repository.CountryRepository;
import com.mujeeb.barter.repository.StateRepository;
import com.mujeeb.barter.repository.UnitRepository;

@SpringBootApplication
public class BarterApplication {

	public static String CSV_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSSSSSS";
	public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(CSV_DATE_FORMAT);

	@Autowired
	private ResourceLoader resourceLoader;

	public static void main(String[] args) {
		SpringApplication.run(BarterApplication.class, args);
	}

	@Bean
	public CommandLineRunner unitsLoader(UnitRepository repository) {

		return (args) -> {

			try {
				
				// If there is already existing data, do not insert master data
				if(repository.findAll().iterator().hasNext()) {
					return;
				}
				
				InputStreamReader input = new InputStreamReader(resourceLoader.getResource("classpath:unit_master.csv").getInputStream());
				CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(input);
				for (CSVRecord record : csvParser) {
					String name = record.get("NAME");
					String description = record.get("DESCRIPTION");

					repository.save(new Unit(name, description));
				}
			} catch(Exception ex) {

				ex.printStackTrace();
			}
		};
	}

	@Bean
	public CommandLineRunner addressDataLoader(CountryRepository countryRepository, StateRepository stateRepository, CityRepository cityRepository) {

		return (args) -> {

			try {
				
				// If there is already existing data, do not insert master data
				if(countryRepository.findAll().iterator().hasNext()) {
					return;
				}
				
				InputStreamReader input = new InputStreamReader(resourceLoader.getResource("classpath:cities_master.csv").getInputStream());
				CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(input);
				
				for (CSVRecord record : csvParser) {
					String name = record.get("name");
					String state = record.get("state_name");
					String country = record.get("country_name");
					String latitude = record.get("latitude");
					String longitude = record.get("longitude");
					
					Country beanCountry = countryRepository.findByName(country.toLowerCase());
					if(beanCountry == null) {
						beanCountry = new Country(country.toLowerCase(), new ArrayList<Long>());
					}
					beanCountry = countryRepository.save(beanCountry);
					
					State beanState = stateRepository.findByName(state.toLowerCase());
					if(beanState == null) {
						beanState = new State(state.toLowerCase(), new ArrayList<>());
						beanState.setCountryId(beanCountry.getId());
					}					
					beanState = stateRepository.save(beanState);
					beanCountry.addStateId(beanState.getId());
					beanCountry = countryRepository.save(beanCountry);
					
					City beanCity = cityRepository.findByName(name.toLowerCase());
					if(beanCity == null) {
						beanCity = new City(name.toLowerCase(), Double.parseDouble(latitude), Double.parseDouble(longitude));
						beanCity.setStateId(beanState.getId());
						beanCity = cityRepository.save(beanCity);
					}
					
					beanState.getCityIds().add(beanCity.getId());
					beanState = stateRepository.save(beanState);
				}
				
			} catch(Exception ex) {

				ex.printStackTrace();
			}
		};
	}
}
