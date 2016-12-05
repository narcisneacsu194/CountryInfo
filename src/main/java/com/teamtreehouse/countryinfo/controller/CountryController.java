package com.teamtreehouse.countryinfo.controller;

import com.teamtreehouse.countryinfo.model.Country;
import com.teamtreehouse.countryinfo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listCountries(ModelMap modelMap){
        List<Country> countries = countryRepository.getAllCountries();
        modelMap.put("countries", countries);
        return "index";
    }

    @RequestMapping("/countries/{name}")
    public String countryDetails(@PathVariable String name, ModelMap modelMap){
        Country country = countryRepository.getCountryByName(name);
        modelMap.put("country", country);
        return "detail";
    }
}
