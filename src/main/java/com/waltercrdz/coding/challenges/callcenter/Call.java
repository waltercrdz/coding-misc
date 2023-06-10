package com.waltercrdz.coding.challenges.callcenter;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Call {

    private int seconds;

    public Call(int duration) {
        if (!this.isValidDuration(duration))
            throw new IllegalArgumentException("Duration time must be a positive number");
        this.seconds = duration;
    }

    public void execute() {
        try {
            TimeUnit.SECONDS.sleep(this.seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Call newInstance() {
        return new Call(new Random().nextInt(MAX_DURATION) + MIN_DURATION);
    }

    private boolean isValidDuration(int duration) {
        return duration >= MIN_DURATION && duration <= MAX_DURATION;
    }

    @Override
    public String toString() {
        return "Call{" +
                "seconds=" + seconds +
                '}';
    }

    private static final int MAX_DURATION = 10;
    private static final int MIN_DURATION = 1;
}
