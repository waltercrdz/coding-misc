package com.waltercrdz.coding.design.patterns.composite;

import java.util.Objects;

public class File extends Node {

    public File(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;
        File node = (File) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + getClass().hashCode();
    }
}
