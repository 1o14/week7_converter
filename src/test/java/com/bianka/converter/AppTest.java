package com.bianka.converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {
    @Test
    public void testFahrenheitToCelsius() {
        App app = new App();
        assertEquals(0.0, app.fahrenheitToCelsius(32), 0.01);
    }

    @Test
    public void testKelvinToCelsius() {
        App app = new App();
        assertEquals(0.0, app.kelvinToCelsius(273.15), 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        App app = new App();
        assertEquals(273.15, app.celsiusToKelvin(0), 0.01);
    }
}
