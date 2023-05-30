package com.waltercrdz.coding.design.patterns.proxy;

import java.util.*;

public class CityProxyProvider implements CityProvider {

    private List<City> cache;
    private CityProvider provider;

    public CityProxyProvider(CityProvider provider) {
        this.cache = new ArrayList<>();
        this.provider = provider;
    }

    @Override
    public List<City> findAll() {
        if (this.cache.isEmpty())
            this.cache.addAll(this.provider.findAll());
        return this.cache;
    }

    private List<City> initializeCache(List<City> all) {
        this.cache.addAll(all);
        return all;
    }
}
