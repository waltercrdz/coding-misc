package com.waltercrdz.coding.design.patterns.composite;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Directory extends Node {

    private Set<Node> children;

    public Directory(String name) {
        super(name);
        this.children = new HashSet<>();
    }

    public boolean addChild(Node node) {
        return this.children.add(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Directory)) return false;
        Directory node = (Directory) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + getClass().hashCode();
    }
}
