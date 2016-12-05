package com.teamtreehouse.countryinfo.repository;

import com.teamtreehouse.countryinfo.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES =
            Arrays.asList(
                    new Country("India", 1_276_267_000, "New Delhi", Arrays.asList("Hindi", "English")),
                    new Country("Kenya", 45_010_056, "Nairobi", Arrays.asList("English", "Kiswahili")),
                    new Country("Ecuador", 16_144_000, "Quito", Arrays.asList("Spanish")),
                    new Country("France", 66_736_000, "Paris", Arrays.asList("French")),
                    new Country("Italy", 60_674_003, "Rome", Arrays.asList("Italian"))
            );

    public List<Country> getAllCountries(){
        return ALL_COUNTRIES;
    }

    public Country getCountryByName(String name){
        return ALL_COUNTRIES.stream().filter(
                country -> country.getName().equals(name)
        ).findFirst().get();
    }
}
