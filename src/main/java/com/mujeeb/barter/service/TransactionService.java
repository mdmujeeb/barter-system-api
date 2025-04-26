package com.mujeeb.barter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mujeeb.barter.entity.Category;
import com.mujeeb.barter.entity.City;
import com.mujeeb.barter.entity.Country;
import com.mujeeb.barter.entity.ExchangeRequest;
import com.mujeeb.barter.entity.Listing;
import com.mujeeb.barter.entity.Order;
import com.mujeeb.barter.entity.Product;
import com.mujeeb.barter.entity.State;
import com.mujeeb.barter.entity.Subcategory;
import com.mujeeb.barter.entity.Unit;
import com.mujeeb.barter.repository.CategoryRepository;
import com.mujeeb.barter.repository.CityRepository;
import com.mujeeb.barter.repository.CountryRepository;
import com.mujeeb.barter.repository.ExchangeRequestRepository;
import com.mujeeb.barter.repository.ListingRepository;
import com.mujeeb.barter.repository.OrderRepository;
import com.mujeeb.barter.repository.ProductRepository;
import com.mujeeb.barter.repository.StateRepository;
import com.mujeeb.barter.repository.SubCategoryRepository;
import com.mujeeb.barter.repository.UnitRepository;
import com.mujeeb.barter.repository.UserRepository;

@Component
public class TransactionService {

    @Autowired
    private CountryRepository countryRepository;
    
    @Autowired
    private StateRepository stateRepository;
    
    @Autowired
    private CityRepository cityRepository;
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UnitRepository unitRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ExchangeRequestRepository exchangeRequestRepository;

    @Autowired
    private ListingRepository listingRepository;
    
    // Unit operations
    
    public Unit addUnit(Unit unit) {
        return unitRepository.save(unit);
    }
    
    public Unit updateUnit(Unit unit) {
    	return unitRepository.save(unit);
    }
    
    public boolean deleteUnit(Unit unit) {
    	unitRepository.delete(unit);
    	return true;
    }
    
    // Address operations
    
    // Country
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }
    
    public Country updateCountry(Country country) {
    	return countryRepository.save(country);
    }
    
    public boolean deleteCountry(Country country) {
    	countryRepository.delete(country);
    	return true;
    }
    
    // State
    public State addState(State state) {
        return stateRepository.save(state);
    }
    
    public State updateState(State state) {
    	return stateRepository.save(state);
    }
    
    public boolean deleteState(State state) {
    	stateRepository.delete(state);
    	return true;
    }
    
    // City
    public City addCity(City city) {
        return cityRepository.save(city);
    }
    
    public City updateCity(City city) {
    	return cityRepository.save(city);
    }
    
    public boolean deleteCity(City city) {
    	cityRepository.delete(city);
    	return true;
    }
    
    // Category Operations
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }
    
    public Category updateCategory(Category category) {
    	return categoryRepository.save(category);
    }
    
    public boolean deleteCategory(Category category) {
    	categoryRepository.delete(category);
    	return true;
    }
    
    // SubCategory operations
    public Subcategory addSubCategory(Subcategory subcategory) {
        return subCategoryRepository.save(subcategory);
    }
    
    public Subcategory updateSubCategory(Subcategory subcategory) {
    	return subCategoryRepository.save(subcategory);
    }
    
    public boolean deleteSubCategory(Subcategory subcategory) {
    	subCategoryRepository.delete(subcategory);
    	return true;
    }
    
    // Product Operations
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    
    public Product updateProduct(Product product) {
    	return productRepository.save(product);
    }
    
    public boolean deleteProduct(Product product) {
    	productRepository.delete(product);
    	return true;
    }
    
    // Listing Operations
    public Listing addListing(Listing listing) {
        return listingRepository.save(listing);
    }
    
    public Listing updateListing(Listing listing) {
    	return listingRepository.save(listing);
    }
    
    public boolean deleteListing(Listing listing) {
    	listingRepository.delete(listing);
    	return true;
    }
    
    // ExchangeRequest Operations
    public ExchangeRequest addExchangeRequest(ExchangeRequest exchangeRequest) {
        return exchangeRequestRepository.save(exchangeRequest);
    }
    
    public ExchangeRequest updateExchangeRequest(ExchangeRequest exchangeRequest) {
    	return exchangeRequestRepository.save(exchangeRequest);
    }
    
    public boolean deleteExchangeRequest(ExchangeRequest exchangeRequest) {
    	exchangeRequestRepository.delete(exchangeRequest);
    	return true;
    }
    
    // Order Operations
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }
    
    public Order updateOrder(Order order) {
    	return orderRepository.save(order);
    }
    
    public boolean deleteOrder(Order order) {
    	orderRepository.delete(order);
    	return true;
    }
}
