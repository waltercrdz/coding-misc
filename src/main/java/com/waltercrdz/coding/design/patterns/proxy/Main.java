package com.waltercrdz.coding.design.patterns.proxy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        final CityProvider provider = new CityProxyProvider(new CityRestProvider(new RestConnector()));
        final List<City> cities = provider.findAll();
        final List<City> cities2 = provider.findAll();
    }
}
