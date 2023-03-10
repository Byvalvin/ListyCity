package com.example.listycity;


//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThrows;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

public class CityListTest {

    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity(){
        return new City("Edmonton", "AB");
    }


//    @Test
//    void testAdd(){
//        CityList cityList = mockCityList();
//        assertEquals(1, cityList.getCities().size());
//        City city = new City("Regina", "SK");
//        cityList.add(city);
//        assertEquals(2, cityList.getCities().size());
//        assertTrue(cityList.getCities().contains(city));
//    }
//
//    @Test
//    void testAddException(){
//        CityList cityList = mockCityList();
//
//        City city = new City("Yellowknife", "NWT");
//        cityList.add(city);
//
//        assertThrows(IllegalArgumentException.class,
//                ()->{cityList.add(city);
//        });
//    }


//    @Test
//    void testGetCities(){
//        CityList cityList = mockCityList();
//
//        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
//
//        City city = new City("Charlottetown","PEI");
//        cityList.add(city);
//        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
//        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
//    }


    ///LABB TESTS STUFFECSS
    @Test
    void testHasCity(){
        CityList cityList = mockCityList();

        City city = new City("Calgary", "AB");

        assertFalse(cityList.hasCity(city));//check is work when not there
        cityList.add(city);
        assertTrue(cityList.hasCity(city));//check if works when there
    }

    @Test
    void testDelete(){
        CityList cityList = mockCityList();

        City city = new City("Calgary", "AB");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));//check there
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));//check gone
    }

    @Test
    void testDeleteException(){
        CityList cityList = mockCityList();

        City city = new City("Calgary", "AB");

        assertThrows(IllegalArgumentException.class,
                ()-> {
                    cityList.delete(city); // delete city not added
        });
    }

    @Test
    void testCountCities(){
        CityList cityList = mockCityList();

        City city = new City("Calgary", "AB");
        City City = new City("City", "City");

        assertEquals(1,cityList.countCities());//self explanatory
        cityList.add(city);
        assertEquals(2,cityList.countCities());
        cityList.add(City);
        assertEquals(3,cityList.countCities());
    }
}
