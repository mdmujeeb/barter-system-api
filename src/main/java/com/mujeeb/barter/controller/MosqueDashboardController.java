package com.mujeeb.barter.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mujeeb.barter.beans.BaseException;
import com.mujeeb.barter.beans.mappers.ProductBeanMapper;
import com.mujeeb.barter.beans.mappers.UserBeanMapper;
import com.mujeeb.barter.beans.request.BaseRequestBean;
import com.mujeeb.barter.beans.request.ListingRequestBean;
import com.mujeeb.barter.beans.request.ProductRequestBean;
import com.mujeeb.barter.beans.request.UserRequestBean;
import com.mujeeb.barter.beans.response.BaseResponseBean;
import com.mujeeb.barter.beans.response.ProductResponseBean;
import com.mujeeb.barter.beans.response.UserResponseBean;
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
import com.mujeeb.barter.entity.User;
import com.mujeeb.barter.service.TransactionService;
import com.mujeeb.barter.service.UserService;
import com.mujeeb.barter.util.DateUtil;

@RestController
public class MosqueDashboardController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private TransactionService transactionService;
    
    @PostMapping(value = "/authenticate", consumes = "application/json", produces="application/json")
    public BaseResponseBean authenticate(@RequestBody BaseRequestBean bean) {
        try {

            userService.authenticateUser(bean.getUserId(), bean.getPassword());

            return new BaseResponseBean(0, "Authentication Successful.");

        } catch(BaseException b) {

            return new BaseResponseBean(b.getReasonCode());
        }
    }

    @GetMapping(value = "/getDataForMobileApp", produces = "application/json")
    public Map<String,Object> getDataForMobileApp(@RequestParam BaseRequestBean bean) {
    	
    	User user = null;
    	try {
    		user = userService.getUserByUserId(bean.getUserId());
    	}catch(BaseException ex) {
    		ex.printStackTrace();
    	}
    	List<Listing> listings = transactionService.findAllListingForUser(user);
    	List<ExchangeRequest> outgoingRequests = transactionService.findAllOutgoingExchangeRequestsForUser(user);
    	List<ExchangeRequest> incomingRequests = transactionService.findAllIncomingExchangeRequestsForUser(user);
    	List<Order> buyOrders = transactionService.findAllBuyOrders(user);
    	List<Order> sellOrders = transactionService.findAllSellOrders(user);
    	List<Listing> publicListings = transactionService.findTopNListings(10);

        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("userDetails", user);
        returnMap.put("listings", listings);
        returnMap.put("outgoingRequests", outgoingRequests);
        returnMap.put("incomingRequests", incomingRequests);
        returnMap.put("buyOrders", buyOrders);
        returnMap.put("sellOrders", sellOrders);
        returnMap.put("publicListings", publicListings);

        return returnMap;
    }
    
    @GetMapping(value = "/getAllProducts", produces = "application/json")
    public List<Product> getAllProducts() {

    	return transactionService.findAllProducts();
    }
    
    @GetMapping(value = "/getProductsByDescription", produces = "application/json")
    public List<Product> getProductsByDescription(@RequestParam String description) {

    	return transactionService.findTopNProductsByDescription(description, 10);
    }

    @GetMapping(value = "/getAllUserListings", produces = "application/json")
    public List<Listing> getAllUserListings(@RequestParam BaseRequestBean bean) {

    	User user = null;
    	try {
    		user = userService.getUserByUserId(bean.getUserId());
    	}catch(BaseException ex) {
    		ex.printStackTrace();
    	}
        try {
            return transactionService.findAllListingForUser(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new ArrayList<Listing>();
    }

    @GetMapping(value = "/getOutgoingExchangeRequests", produces = "application/json")
    public List<ExchangeRequest> getOutgoingExchangeRequests(@RequestParam BaseRequestBean bean) {

    	User user = null;
    	try {
    		user = userService.getUserByUserId(bean.getUserId());
    	}catch(BaseException ex) {
    		ex.printStackTrace();
    	}
        try {
            return transactionService.findAllOutgoingExchangeRequestsForUser(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new ArrayList<ExchangeRequest>();
    }

    @GetMapping(value = "/getIncomingExchangeRequests", produces = "application/json")
    public List<ExchangeRequest> getIncomingExchangeRequests(@RequestParam BaseRequestBean bean) {

    	User user = null;
    	try {
    		user = userService.getUserByUserId(bean.getUserId());
    	}catch(BaseException ex) {
    		ex.printStackTrace();
    	}
        try {
            return transactionService.findAllIncomingExchangeRequestsForUser(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new ArrayList<ExchangeRequest>();
    }

    @GetMapping(value = "/getAllBuyOrders", produces = "application/json")
    public List<Order> getAllBuyOrders(@RequestParam BaseRequestBean bean) {

    	User user = null;
    	try {
    		user = userService.getUserByUserId(bean.getUserId());
    	}catch(BaseException ex) {
    		ex.printStackTrace();
    	}
        try {
            return transactionService.findAllBuyOrders(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new ArrayList<Order>();
    }

    @GetMapping(value = "/getAllSellOrders", produces = "application/json")
    public List<Order> getAllSellOrders(@RequestParam BaseRequestBean bean) {

    	User user = null;
    	try {
    		user = userService.getUserByUserId(bean.getUserId());
    	}catch(BaseException ex) {
    		ex.printStackTrace();
    	}
        try {
            return transactionService.findAllSellOrders(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new ArrayList<Order>();
    }

    @GetMapping(value = "/getPublicListings", produces = "application/json")
    public List<Listing> getPublicListings(@RequestParam ListingRequestBean bean) {

    	Set<Listing> listings = new HashSet<Listing>();
        try {
        	if(bean.getSearchText() != null && !bean.getSearchText().isEmpty()) {
        		listings.addAll(transactionService.findTopNListingsByDescription(bean.getSearchText(), 100));
        	}
        	
        	if(bean.getProductId() != -1) {
        		Product product = transactionService.findProductById(bean.getProductId());
        		listings.addAll(transactionService.findTopNListingsByProduct(product, 100));
        	}
        	
        	if(bean.getCategoryId() != -1) {
        		Category category = transactionService.findCategoryById(bean.getProductId());
        		listings.addAll(transactionService.findTopNListingsByCategory(category, 100));
        	}
        	
        	if(bean.getSubcategoryId() != -1) {
        		Subcategory subcategory = transactionService.findSubcategoryById(bean.getProductId());
        		listings.addAll(transactionService.findTopNListingsBySubcategory(subcategory, 100));
        	}
        	
        	if(bean.getTargetUserId() != -1) {
        		User targetUser = userService.getUserById(bean.getTargetUserId());
        		listings.addAll(transactionService.findTopNListingsByUser(targetUser, 100));
        	}
        	
            return transactionService.getTopNListings(listings, bean.getResultCount());

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new ArrayList<Listing>();
    }

    @PostMapping(value = "/addUser", consumes = "application/json", produces="application/json")
    public UserResponseBean addUser(@RequestBody UserRequestBean bean) {
    	
    	Date dateOfBirth = null;
    	try {
    		dateOfBirth = DateUtil.parseDate(bean.getDateOfBirth());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	double latitude = -1, longitude = -1;
    	try {
    		latitude = Double.parseDouble(bean.getLatitude());
    		longitude = Double.parseDouble(bean.getLongitude());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Country country = null;
    	try {
    		country = transactionService.findCountryById(bean.getCountryId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	State state = null;
    	try {
    		state = transactionService.findStateById(bean.getStateId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	City city = null;
    	try {
    		city = transactionService.findCityById(bean.getCityId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Date currentDate = new Date();
    	
    	User user = new User(bean.getUserId(), bean.getFirstName(), bean.getLastName(), bean.getMobile(), bean.getEmail()
    			, dateOfBirth, bean.getAddress1(), bean.getAddress2(), city, state, country, bean.getPinCode()
    			, bean.getPassword(), currentDate, latitude, longitude, currentDate, currentDate);

        user = userService.saveUser(user);
        
        UserResponseBean response = UserBeanMapper.toResponseBean(user);
        response.setResultCode(0);
        response.setResultDescription("New User was added Successfully.");
        return response; 
    }
    
    @PostMapping(value = "/updateUser", consumes = "application/json", produces="application/json")
    public UserResponseBean updateUser(@RequestBody UserRequestBean bean) {
    	
    	User user = null;
    	try {
    		user = userService.getUserById(bean.getId());
    	}catch(Exception ex) {
    		UserResponseBean response = new UserResponseBean();
    		response.setResultCode(-1);
    		response.setResultDescription("User not Found");
    		return response;
    	}
    	
    	Date dateOfBirth = null;
    	try {
    		dateOfBirth = DateUtil.parseDate(bean.getDateOfBirth());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	double latitude = -1, longitude = -1;
    	try {
    		latitude = Double.parseDouble(bean.getLatitude());
    		longitude = Double.parseDouble(bean.getLongitude());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Country country = null;
    	try {
    		country = transactionService.findCountryById(bean.getCountryId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	State state = null;
    	try {
    		state = transactionService.findStateById(bean.getStateId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	City city = null;
    	try {
    		city = transactionService.findCityById(bean.getCityId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	user.setFirstName(bean.getFirstName());
    	user.setLastName(bean.getLastName());
    	user.setDateOfBirth(dateOfBirth);
    	user.setEmail(bean.getEmail());
    	user.setMobile(bean.getMobile());
    	user.setAddress1(bean.getAddress1());
    	user.setAddress2(bean.getAddress2());
    	user.setCity(city);
    	user.setState(state);
    	user.setCountry(country);
    	user.setPinCode(bean.getPinCode());
    	user.setLatitude(latitude);
    	user.setLongitude(longitude);
    	user.setUpdatedAt(new Date());

        user = userService.saveUser(user);
        
        UserResponseBean response = UserBeanMapper.toResponseBean(user);
        response.setResultCode(0);
        response.setResultDescription("User was updated Successfully.");
        return response; 
    }
    
    @PostMapping(value = "/deleteUser", consumes = "application/json", produces="application/json")
    public BaseResponseBean deleteUser(@RequestBody UserRequestBean bean) {
    	
    	User user = null;
    	try {
    		user = userService.getUserById(bean.getId());
    	}catch(Exception ex) {
    		
    		return new BaseResponseBean(-1, "User not Found");
    	}
    	
        boolean result = userService.deleteUser(user);
        
        return new BaseResponseBean(result ? 0 : -1, result ? "User was Deleted Successfully." : "An error occured while trying to perform requested operation."); 
    }
    
    @PostMapping(value = "/addProduct", consumes = "application/json", produces="application/json")
    public ProductResponseBean addProduct(@RequestBody ProductRequestBean bean) {
    	
    	Category category = null;
    	try {
    		category = transactionService.findCategoryById(bean.getCategoryId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Subcategory subcategory = null;
    	try {
    		subcategory = transactionService.findSubcategoryById(bean.getSubcategoryId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Unit unit = null;
    	try {
    		unit = transactionService.findUnitById(bean.getUnitId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}

    	Product product = new Product(bean.getName(), bean.getDescription(), category, subcategory, bean.getImageUrl(), unit);

    	try {
    		product = transactionService.addProduct(product);
    	}catch(Exception ex) {
			/* Do Nothing */
    	}

        ProductResponseBean response = ProductBeanMapper.toResponseBean(product);
        response.setResultCode(0);
        response.setResultDescription("New Product was added Successfully.");
        return response;
    }
    
    @PostMapping(value = "/updateProduct", consumes = "application/json", produces="application/json")
    public ProductResponseBean updateProduct(@RequestBody ProductRequestBean bean) {
    	
    	Product product = null;
    	try {
    		product = transactionService.findProductById(bean.getId());
    	}catch(Exception ex) {
    		ProductResponseBean response = new ProductResponseBean();
    		response.setResultCode(-1);
    		response.setResultDescription("Product not Found");
    		return response;
    	}
    	
    	Category category = null;
    	try {
    		category = transactionService.findCategoryById(bean.getCategoryId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Subcategory subcategory = null;
    	try {
    		subcategory = transactionService.findSubcategoryById(bean.getSubcategoryId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Unit unit = null;
    	try {
    		unit = transactionService.findUnitById(bean.getUnitId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	product.setCategory(category);
    	product.setSubcategory(subcategory);
    	product.setDescription(bean.getDescription());
    	product.setImageUrl(bean.getImageUrl());
    	product.setName(bean.getName());
    	product.setUnit(unit);

    	try {
    		product = transactionService.updateProduct(product);
    	}catch(Exception ex) {
			/* Do Nothing */
    	}

        ProductResponseBean response = ProductBeanMapper.toResponseBean(product);
        response.setResultCode(0);
        response.setResultDescription("Product was updated Successfully.");
        return response;
    }
    
    @PostMapping(value = "/deleteProduct", consumes = "application/json", produces="application/json")
    public BaseResponseBean deleteProduct(@RequestBody ProductRequestBean bean) {
    	
    	Product product = null;
    	try {
    		product = transactionService.findProductById(bean.getId());
    	}catch(Exception ex) {
    		return new BaseResponseBean(-1, "Product not Found");
    	}
    	
        boolean result = transactionService.deleteProduct(product);
        
        return new BaseResponseBean(result ? 0 : -1, result ? "Product was Deleted Successfully." : "An error occured while trying to perform requested operation."); 
    }
    
    @PostMapping(value = "/createListing", consumes = "application/json", produces="application/json")
    public ProductResponseBean createListing(@RequestBody ProductRequestBean bean) {
    	
    	Category category = null;
    	try {
    		category = transactionService.findCategoryById(bean.getCategoryId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Subcategory subcategory = null;
    	try {
    		subcategory = transactionService.findSubcategoryById(bean.getSubcategoryId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}
    	
    	Unit unit = null;
    	try {
    		unit = transactionService.findUnitById(bean.getUnitId());
    	}catch(Exception ex) {
			/* Do Nothing */
    	}

    	Product product = new Product(bean.getName(), bean.getDescription(), category, subcategory, bean.getImageUrl(), unit);

    	try {
    		product = transactionService.addProduct(product);
    	}catch(Exception ex) {
			/* Do Nothing */
    	}

        ProductResponseBean response = ProductBeanMapper.toResponseBean(product);
        response.setResultCode(0);
        response.setResultDescription("New Product was added Successfully.");
        return response;
    }
}
