package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {


    private List<City> cities = new ArrayList<>();

    /**
     * This adds city to list if it does not exist
     * @param city
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     *This returns list of cities
     * @return
     * return sorted list
     */
    public List<City> getCities(){
        List<City> sorted = cities;
        Collections.sort(sorted);
        return sorted;
    }

    /**
     * This checks if given city is in list
     * @param city
     * @return
     * return boolean
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * This removes given city from list if it is in list
     * @param city
     */
    public void delete(City city){
        if(!hasCity(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);

    }

    /**
     * This returns number of cities in list
     * @return
     * return integer
     */
    public int countCities(){
        return cities.size();
    }


}
