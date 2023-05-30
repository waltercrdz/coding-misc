package com.waltercrdz.coding.design.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class RestConnector {

    /**
     * This access should be remote
     * @return A list of cities
     */
    public List<City> doingRemoteAccess() {
        System.out.println("Remote access");
        final List<City> cities = new ArrayList<>();
        cities.add(new City("Buenos Aires"));
        cities.add(new City("Barcelona"));
        cities.add(new City("Roma"));
        cities.add(new City("Madrid"));
        cities.add(new City("Rio de Janeiro"));
        cities.add(new City("New York"));
        cities.add(new City("Miami"));
        cities.add(new City("Ciudad de Mexico"));
        cities.add(new City("Paris"));
        return cities;
    }
}
