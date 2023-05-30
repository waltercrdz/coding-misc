package com.waltercrdz.coding.design.patterns.decorator;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class User {

    private final HashMap<String, Set<String>> permissions;
    private final String email;

    public User(HashMap<String, Set<String>> permissions, String email) {
        this.permissions = permissions;
        this.email = Objects.requireNonNull(email, "Email is mandatory");
    }

    public boolean hasPermission(String application, String permission) {
        return this.hasApplication(application) ? this.permissions.get(application).contains(permission) :  false;
    }

    public boolean hasApplication(String application) {
        return this.permissions.containsKey(application);
    }

    public String getEmail() {
        return email;
    }
}
