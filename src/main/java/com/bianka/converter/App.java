package com.bianka.converter;

public class App {
    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public double celsiusToKelvin(double c) {
        return c + 273.15;
    }
}
