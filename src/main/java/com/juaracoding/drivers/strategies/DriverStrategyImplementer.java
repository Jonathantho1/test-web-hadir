package com.juaracoding.drivers.strategies;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
            case "firefox":
                return new FireFox();
            default:
                return null;
        }
    }
}
