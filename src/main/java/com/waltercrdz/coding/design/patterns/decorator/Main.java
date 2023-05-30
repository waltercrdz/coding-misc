package com.waltercrdz.coding.design.patterns.decorator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Resource resource = new AuthenticationFilter(
                new AuthorizationFilter(new ConcreteResource("Protected resource"), "idm", "delete"), "idm");
        final User user = createUser();
        resource.execute(user);
    }

    public static User createUser() {
        Set<String> permissions = new HashSet<>();
        permissions.add("read");
        permissions.add("write");
        HashMap<String, Set<String>> applicationMap = new HashMap<>();
        applicationMap.put("idm", permissions);
        applicationMap.put("notifications", permissions);
        return new User(applicationMap, "waltercrdz@gmail.com");
    }
}
