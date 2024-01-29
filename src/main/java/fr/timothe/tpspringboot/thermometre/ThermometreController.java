package fr.timothe.tpspringboot.thermometre;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

        return thermometreService.getTemperatureEveryFormat();
    }
}
