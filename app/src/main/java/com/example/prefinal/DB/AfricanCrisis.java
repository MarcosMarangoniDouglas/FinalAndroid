package com.example.prefinal.DB;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AfricanCrisis implements Serializable {

    @SerializedName("case")
    int casef;
    String cc3;
    String country;
    int year;
    int systematic_crisis;
    int exch_usd;
    int domestic_debt_in_default;
    int sovereign_external_debt_default;
    int gdp_weighted_default;
    double inflation_annual_cpi;
    int independece;
    int currency_crisis;
    int inflation_crisis;
    String banking_crisis;

    public AfricanCrisis(int casef, String cc3, String country, int year, int systematic_crisis,
                         int exch_usd, int domestic_debt_in_default, int sovereign_external_debt_default,
                         int gdp_weighted_default, double inflation_annual_cpi, int independece,
                         int currency_crisis, int inflation_crisis, String banking_crisis) {
        this.casef = casef;
        this.cc3 = cc3;
        this.country = country;
        this.year = year;
        this.systematic_crisis = systematic_crisis;
        this.exch_usd = exch_usd;
        this.domestic_debt_in_default = domestic_debt_in_default;
        this.sovereign_external_debt_default = sovereign_external_debt_default;
        this.gdp_weighted_default = gdp_weighted_default;
        this.inflation_annual_cpi = inflation_annual_cpi;
        this.independece = independece;
        this.currency_crisis = currency_crisis;
        this.inflation_crisis = inflation_crisis;
        this.banking_crisis = banking_crisis;
    }

    public int getCasef() {
        return casef;
    }

    public void setCasef(int casef) {
        this.casef = casef;
    }

    public String getCc3() {
        return cc3;
    }

    public void setCc3(String cc3) {
        this.cc3 = cc3;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSystematic_crisis() {
        return systematic_crisis;
    }

    public void setSystematic_crisis(int systematic_crisis) {
        this.systematic_crisis = systematic_crisis;
    }

    public int getExch_usd() {
        return exch_usd;
    }

    public void setExch_usd(int exch_usd) {
        this.exch_usd = exch_usd;
    }

    public int getDomestic_debt_in_default() {
        return domestic_debt_in_default;
    }

    public void setDomestic_debt_in_default(int domestic_debt_in_default) {
        this.domestic_debt_in_default = domestic_debt_in_default;
    }

    public int getSovereign_external_debt_default() {
        return sovereign_external_debt_default;
    }

    public void setSovereign_external_debt_default(int sovereign_external_debt_default) {
        this.sovereign_external_debt_default = sovereign_external_debt_default;
    }

    public int getGdp_weighted_default() {
        return gdp_weighted_default;
    }

    public void setGdp_weighted_default(int gdp_weighted_default) {
        this.gdp_weighted_default = gdp_weighted_default;
    }

    public double getInflation_annual_cpi() {
        return inflation_annual_cpi;
    }

    public void setInflation_annual_cpi(double inflation_annual_cpi) {
        this.inflation_annual_cpi = inflation_annual_cpi;
    }

    public int getIndependece() {
        return independece;
    }

    public void setIndependece(int independece) {
        this.independece = independece;
    }

    public int getCurrency_crisis() {
        return currency_crisis;
    }

    public void setCurrency_crisis(int currency_crisis) {
        this.currency_crisis = currency_crisis;
    }

    public int getInflation_crisis() {
        return inflation_crisis;
    }

    public void setInflation_crisis(int inflation_crisis) {
        this.inflation_crisis = inflation_crisis;
    }

    public String getBanking_crisis() {
        return banking_crisis;
    }

    public void setBanking_crisis(String banking_crisis) {
        this.banking_crisis = banking_crisis;
    }

    @Override
    public String toString() {
        return "AfricanCrisis{" +
          "country='" + country + '\'' +
          ", systematic_crisis=" + systematic_crisis +
          ", currency_crisis=" + currency_crisis +
          ", inflation_crisis=" + inflation_crisis +
          ", banking_crisis='" + banking_crisis + '\'' +
          '}';
    }
}
