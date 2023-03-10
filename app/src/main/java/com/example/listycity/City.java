package com.example.listycity;

/**
 * This class defines a city.
 */
public class City implements Comparable {

    private  String cityname, provname;


    public City(String cityname, String provname) {
        this.cityname = cityname;
        this.provname = provname;
    }

    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.cityname.compareTo(city.getCityname());
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getProvname() {
        return provname;
    }

    public void setProvname(String provname) {
        this.provname = provname;
    }
}