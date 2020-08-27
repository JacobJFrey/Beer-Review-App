package com.techelevator.dao;

import com.techelevator.model.Brewery;
import java.util.List;

public interface BreweryDAO {

    List<Brewery> findAll();

    Brewery getBreweryById(Long userId);

    Brewery findByBreweryName(String username);
    
    List<Brewery> findMyBreweries(Long userId);

    Brewery create(Brewery newBrewery);
    
    Brewery update(Brewery brewery, Long id);
    
    void delete(Long id);
    
	int findIdByBreweryName(String breweryName);
	
	Brewery updateBrewer(Long breweryId, Long brewerId);
}
