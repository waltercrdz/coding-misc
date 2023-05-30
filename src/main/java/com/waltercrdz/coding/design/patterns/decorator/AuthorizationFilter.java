package com.waltercrdz.coding.design.patterns.decorator;

public class AuthorizationFilter extends SecureResource {

    private final String application;
    private final String permission;

    public AuthorizationFilter(Resource resource, String application, String permission) {
        super(resource);
        this.application = application;
        this.permission = permission;
    }

    @Override
    protected void doExecute(User user) {
        if (!user.hasPermission(this.application, this.permission))
            throw new RuntimeException("User does not have permission " + this.permission + " of application " + this.application);
    }
}
