package fr.timothe.tpspringboot.thermometre;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThermometreService {
    public Thermometre getTemperatureEveryFormat() {
       Thermometre thermometre = new Thermometre(0.0, 32, 273.15);
       return thermometre;
    }
}
