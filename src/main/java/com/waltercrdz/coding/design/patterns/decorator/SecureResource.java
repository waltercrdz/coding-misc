package com.waltercrdz.coding.design.patterns.decorator;

public abstract class SecureResource implements Resource {

    protected Resource resource;

    public SecureResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void execute(User user) {
        this.doExecute(user);
        this.resource.execute(user);
    }

    protected abstract void doExecute(User user);
}
