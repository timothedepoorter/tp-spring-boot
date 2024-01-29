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

    private double convertFahrenheitInCelcius(double temperature) {
        return (temperature - 32) / 1.8;
    }

    private double convertKelvinInCelcius(double temperature) {
        return temperature - 273.15;
    }

    public Thermometre getTemperatureEveryFormat(double temperatureCelcius) {
        Thermometre thermometre = new Thermometre(
                temperatureCelcius,
                convertCelciusInFahrenheit(temperatureCelcius),
                convertCelciusInKelvin(temperatureCelcius)
        );
        return thermometre;
    }

    public Thermometre convertTemperature(double temperature, String unit) {
        if (unit.equals("fahreinheit")) {
            double temperatureInCelcius = convertFahrenheitInCelcius(temperature);
            return getTemperatureEveryFormat(temperatureInCelcius);
        } else if (unit.equals("kelvin")) {
            double temperatureInCelcius = convertKelvinInCelcius(temperature);
            return getTemperatureEveryFormat(temperatureInCelcius);
        } else {
            // celcius par défaut
            return getTemperatureEveryFormat(temperature);
        }
    }
}
