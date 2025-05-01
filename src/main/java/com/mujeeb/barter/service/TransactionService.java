package com.mujeeb.barter.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mujeeb.barter.entity.Category;
import com.mujeeb.barter.entity.City;
import com.mujeeb.barter.entity.Country;
import com.mujeeb.barter.entity.ExchangeRequest;
import com.mujeeb.barter.entity.Listing;
import com.mujeeb.barter.entity.Orders;
import com.mujeeb.barter.entity.Product;
import com.mujeeb.barter.entity.State;
import com.mujeeb.barter.entity.Subcategory;
import com.mujeeb.barter.entity.Unit;
import com.mujeeb.barter.entity.User;
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
    
    public Unit findUnitById(Long id) {
    	return unitRepository.findById(id);
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
    
    public Country findCountryById(Long id) {
    	return countryRepository.findById(id);
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
    
    public State findStateById(Long id) {
    	return stateRepository.findById(id);
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
    
    public City findCityById(Long id) {
    	return cityRepository.findById(id);
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
    
    public Category findCategoryById(Long id) {
    	return categoryRepository.findById(id);
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
    
    public Subcategory findSubcategoryById(Long id) {
    	return subCategoryRepository.findById(id);
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
    
    public Product findProductById(Long id) {
    	return productRepository.findById(id);
    }
    
    public List<Product> findAllProducts() {
    	List<Product> products = new ArrayList<Product>();
    	productRepository.findAll().forEach(product -> products.add(product));
    	return products;
    }
    
    public List<Product> findTopNProductsByDescription(String description, int n) {
    	
    	List<Product> products = new ArrayList<Product>();
    	productRepository.findAll().forEach(product -> {
    		if(product.getDescription().toLowerCase().contains(description.toLowerCase())) {
    			products.add(product); 
    		}
    	});
    	
    	return getTopNProducts(products, n);
    }
    
    public List<Product> getTopNProducts(Iterable<Product> iterable, int n) {
    	Iterator<Product> iterator = iterable.iterator();
    	List<Product> products = new ArrayList<Product>();
    	for(int i=0; i<n; i++) {
    		if(!iterator.hasNext()) {
    			break;
    		}
    		products.add(iterator.next());
    	}
    	return products;
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
    
    public Listing findListingById(Long id) {
    	return listingRepository.findById(id);
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
    
    public ExchangeRequest findExchangeRequestById(Long id) {
    	return exchangeRequestRepository.findById(id);
    }
    
    // Orders Operations
    public Orders addOrder(Orders order) {
        return orderRepository.save(order);
    }
    
    public Orders updateOrder(Orders order) {
    	return orderRepository.save(order);
    }
    
    public boolean deleteOrder(Orders order) {
    	orderRepository.delete(order);
    	return true;
    }
    
    // Utility Methods
    
    public List<Listing> findAllListingForUser(User user) {
    	return listingRepository.findByUserId(user.getId());
    }
    
    public List<ExchangeRequest> findAllOutgoingExchangeRequestsForUser(User user) {
    	return exchangeRequestRepository.findByRequestedByUserId(user.getId());
    }
    
    public List<ExchangeRequest> findAllIncomingExchangeRequestsForUser(User user) {
    	List<Listing> listings = listingRepository.findByUserId(user.getId());
    	return listings.stream().map(listing -> exchangeRequestRepository.findByIncomingListingId(listing.getId())).flatMap(requests -> requests.stream()).collect(Collectors.toList());
    }
    
    public List<Orders> findAllBuyOrders(User user) {
    	return orderRepository.findByBuyerId(user.getId());
    }
    
    public List<Orders> findAllSellOrders(User user) {
    	return orderRepository.findBySellerId(user.getId());
    }
    
    public List<Listing> findTopNListings(int n) {
    	return getTopNListings(listingRepository.findAll(), n);
    }
    
    public List<Listing> findTopNListingsByProduct(Product product, int n) {
    	return getTopNListings(listingRepository.findByProductId(product.getId()), n);
    }
    
    public List<Listing> findTopNListingsByCategory(Category category, int n) {
    	return getTopNListings(listingRepository.findByCategoryId(category.getId()), n);
    }
    
    public List<Listing> findTopNListingsBySubcategory(Subcategory subcategory, int n) {
    	return getTopNListings(listingRepository.findBySubcategoryId(subcategory.getId()), n);
    }
    
    public List<Listing> findTopNListingsByUser(User user, int n) {
    	return getTopNListings(findAllListingForUser(user), n);
    }
    
    public List<Listing> findTopNListingsByDescription(String description, int n) {
//    	ExampleMatcher matcher = ExampleMatcher.matching().withMatcher(
//                "resultDescription", 
//                ExampleMatcher.GenericPropertyMatcher.of(ExampleMatcher.StringMatcher.CONTAINING).ignoreCase()
//          );
//    	return listingRepository.findByDescription(Example.of(new Listing(), matcher)).getContent();
    	
    	List<Listing> listings = new ArrayList<Listing>();
    	listingRepository.findAll().forEach(listing -> {
    		if(listing.getDescription().toLowerCase().contains(description.toLowerCase())) {
    			listings.add(listing); 
    		}
    	});
    	
    	return getTopNListings(listings, n);
    }
    
    public List<Listing> getTopNListings(Iterable<Listing> iterable, int n) {
    	Iterator<Listing> iterator = iterable.iterator();
    	List<Listing> listings = new ArrayList<Listing>();
    	for(int i=0; i<n; i++) {
    		if(!iterator.hasNext()) {
    			break;
    		}
    		listings.add(iterator.next());
    	}
    	return listings;
    }
}
