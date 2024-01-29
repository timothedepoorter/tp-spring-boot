package fr.timothe.tpspringboot.thermometre;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/temperature")
public class ThermometreController {
    ThermometreService thermometreService;

    public ThermometreController(ThermometreService thermometreService) {
        this.thermometreService = thermometreService;
    }

    @GetMapping()
    public Thermometre getTemperatureEveryFormat() {
        return thermometreService.getTemperatureEveryFormat(0.0);
    }

    @GetMapping("/param")
    public Thermometre getTemperatureEveryFormatParam(@RequestParam double celcius) {
        return thermometreService.getTemperatureEveryFormat(celcius);
    }

    @PostMapping(path = "/conver")
    public Thermometre convertTemperature(@RequestBody ThermometreDto thermometreDto) {
        return this.thermometreService.convertTemperature(
                thermometreDto.getValue(),
                thermometreDto.getUnit()
        );
    }
}
