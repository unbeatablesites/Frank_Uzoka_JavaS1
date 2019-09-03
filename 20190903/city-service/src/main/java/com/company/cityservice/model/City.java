package com.company.cityservice.model;

import javax.validation.constraints.NotEmpty;

public class City {


    private int cityId;
    @NotEmpty(message = "This field cannot be empty pleaase enter a city.")
    private String cityName;
    @NotEmpty(message = "This field cannot be empty pleaase enter a state.")
    private String cityState;
    @NotEmpty(message = "This field cannot be empty pleaase enter a population")
    private String population;
    private boolean whetherCapital;



    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public boolean isWhetherCapital() {
        return whetherCapital;
    }

    public void setWhetherCapital(boolean whetherCapital) {
        this.whetherCapital = whetherCapital;
    }
}
