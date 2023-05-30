package com.waltercrdz.coding.design.patterns.proxy;

import java.util.List;

public class CityRestProvider implements CityProvider {

    private final RestConnector connector;

    public CityRestProvider(RestConnector connector) {
        this.connector = connector;
    }

    @Override
    public List<City> findAll() {
        return connector.doingRemoteAccess();
    }
}
