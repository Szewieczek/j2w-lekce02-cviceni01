package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class MainController {
    @GetMapping("/datum")
    public ModelAndView datum() {
        LocalDate AKTUALNI_DATUM = LocalDate.now();
        ModelAndView result = new ModelAndView("datum");
        result.addObject("datum", AKTUALNI_DATUM);
        return result;
    }

    @GetMapping("/cas")
    public ModelAndView cas() {
        LocalTime AKTUALNI_CAS = LocalTime.now();
        ModelAndView result = new ModelAndView("cas");
        result.addObject("cas", AKTUALNI_CAS);
        return result;
    }
}