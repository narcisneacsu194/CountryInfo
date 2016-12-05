package com.teamtreehouse.countryinfo.model;

import java.util.List;

public class Country {
    private String name;
    private String population;
    private String capitalName;
    private List<String> languages;

    public Country(String name, String population, String capitalName, List<String> languages) {
        this.name = name;
        this.population = population;
        this.capitalName = capitalName;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
