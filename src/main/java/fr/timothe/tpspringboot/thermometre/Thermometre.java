package fr.timothe.tpspringboot.thermometre;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Thermometre {
    private double celcius;
    private double fahrenheit;
    private double kelvin;
}
