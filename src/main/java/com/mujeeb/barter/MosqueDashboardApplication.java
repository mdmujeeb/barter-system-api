package com.mujeeb.barter;

import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
import com.mujeeb.barter.repository.CountryRepository;
import com.mujeeb.barter.repository.UnitRepository;

@SpringBootApplication
public class MosqueDashboardApplication {

	public static String CSV_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSSSSSS";
	public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(CSV_DATE_FORMAT);

	@Autowired
	private ResourceLoader resourceLoader;

	public static void main(String[] args) {
		SpringApplication.run(MosqueDashboardApplication.class, args);
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
	public CommandLineRunner addressDataLoader(CountryRepository repository) {

		return (args) -> {

			try {
				
				// If there is already existing data, do not insert master data
				if(repository.findAll().iterator().hasNext()) {
					return;
				}
				
				InputStreamReader input = new InputStreamReader(resourceLoader.getResource("classpath:cities_master.csv").getInputStream());
				CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(input);
				Map<String,Country> countries = new HashMap<String,Country>();
				
				for (CSVRecord record : csvParser) {
					String name = record.get("name");
					String state = record.get("state_name");
					String country = record.get("country_name");
					String latitude = record.get("latitude");
					String longitude = record.get("longitude");
					
					Country beanCountry = countries.get(country);
					if(beanCountry == null) {
						beanCountry = new Country(country, new ArrayList<State>());
						countries.put(country, beanCountry);
					}
					
					State beanState = beanCountry.findStateByName(state);
					if(beanState == null) {
						beanState = new State(state, new ArrayList<>());
					}
					beanCountry.addState(beanState);
					
					City beanCity = beanState.findCityByName(name);
					if(beanCity == null) {
						beanCity = new City(name, Double.parseDouble(latitude), Double.parseDouble(longitude));
					}
					beanState.addCity(beanCity);
				}
				
				Iterator<Country> countrs = countries.values().iterator();
				while(countrs.hasNext()) {
					repository.save(countrs.next());
				}
				
			} catch(Exception ex) {

				ex.printStackTrace();
			}
		};
	}
}
