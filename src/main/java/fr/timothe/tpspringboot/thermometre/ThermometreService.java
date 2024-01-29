package fr.timothe.tpspringboot.thermometre;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThermometreService {
    private double convertCelciusInFahrenheit(double temperature) {
        return temperature * 1.8 + 32;
    }
    private double convertCelciusInKelvin(double temperature) {
        return temperature + 273.15;
    }

    public Thermometre getTemperatureEveryFormat(double temperatureCelcius) {
        Thermometre thermometre = new Thermometre(
                temperatureCelcius,
                convertCelciusInFahrenheit(temperatureCelcius),
                convertCelciusInKelvin(temperatureCelcius)
        );
        return thermometre;
    }
}
