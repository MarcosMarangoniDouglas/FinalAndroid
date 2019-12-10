package com.example.prefinal.DB;

import java.io.Serializable;

public class Country implements Serializable {

    String code;
    String name;
    String continent;
    String region;
    int surface_area;
    int indep_year;
    int population;
    double life_expectancy;
    int gnp;
    int gnp_old;
    String local_name;
    String government_form;
    String head_of_state;
    int capital;
    String code2;

    public Country(String code, String name, String continent, String region, int surface_area,
                   int indep_year, int population, double life_expectancy, int gnp, int gnp_old,
                   String local_name, String government_form, String head_of_state, int capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surface_area = surface_area;
        this.indep_year = indep_year;
        this.population = population;
        this.life_expectancy = life_expectancy;
        this.gnp = gnp;
        this.gnp_old = gnp_old;
        this.local_name = local_name;
        this.government_form = government_form;
        this.head_of_state = head_of_state;
        this.capital = capital;
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getSurface_area() {
        return surface_area;
    }

    public void setSurface_area(int surface_area) {
        this.surface_area = surface_area;
    }

    public int getIndep_year() {
        return indep_year;
    }

    public void setIndep_year(int indep_year) {
        this.indep_year = indep_year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(double life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public int getGnp() {
        return gnp;
    }

    public void setGnp(int gnp) {
        this.gnp = gnp;
    }

    public int getGnp_old() {
        return gnp_old;
    }

    public void setGnp_old(int gnp_old) {
        this.gnp_old = gnp_old;
    }

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    public String getGovernment_form() {
        return government_form;
    }

    public void setGovernment_form(String government_form) {
        this.government_form = government_form;
    }

    public String getHead_of_state() {
        return head_of_state;
    }

    public void setHead_of_state(String head_of_state) {
        this.head_of_state = head_of_state;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
