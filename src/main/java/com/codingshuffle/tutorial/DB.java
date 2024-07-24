package com.codingshuffle.tutorial;

public interface DB {
    public String getData();

    default String getDefaultData() {
        return "Default DB Data";
    }
}
