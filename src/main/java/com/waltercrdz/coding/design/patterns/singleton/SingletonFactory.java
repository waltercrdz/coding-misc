package com.waltercrdz.coding.design.patterns.singleton;

import com.waltercrdz.coding.design.patterns.command.*;
import com.waltercrdz.design.patterns.command.*;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.Supplier;

public class SingletonFactory {

    private final HashMap<String, Supplier<Command>> map;

    private SingletonFactory() {
        this.map = new HashMap<>();
        this.map.put("cd", () -> new ChangeDirectory());
        this.map.put("ls", () -> new ListDirectory());
        this.map.put("quit", () -> new Quit());
        this.map.put("mkdir", () -> new MakeDirectory());
        this.map.put("touch", () -> new CreateFile());
    }

    public static SingletonFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SingletonFactory INSTANCE = new SingletonFactory();
    }

    public Command create(String input) {
        final Supplier<Command> toExecute = this.map.get(input);
        if (Objects.isNull(toExecute)) throw new InvalidCommandException();
        return  toExecute.get();
    }
}
