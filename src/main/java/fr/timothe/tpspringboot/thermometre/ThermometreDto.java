package fr.timothe.tpspringboot.thermometre;

import lombok.Data;

@Data
public class ThermometreDto {
    public double value;
    public String unit;
}
