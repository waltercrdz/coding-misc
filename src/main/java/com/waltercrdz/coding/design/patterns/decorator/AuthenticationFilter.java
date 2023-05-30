package com.waltercrdz.coding.design.patterns.decorator;

public class AuthenticationFilter extends SecureResource {

    private final String application;

    public AuthenticationFilter(Resource resource, String application) {
        super(resource);
        this.application = application;
    }

    @Override
    protected void doExecute(User user) {
        if (!user.hasApplication(this.application))
            throw new RuntimeException("User does not have access to application " + this.application);
    }
}
