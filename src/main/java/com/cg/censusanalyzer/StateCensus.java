package com.cg.censusanalyzer;

import com.opencsv.bean.CsvBindByName;

public class StateCensus {
    public StateCensus() {
    }

    @CsvBindByName(column = "State")
    private String State;
    @CsvBindByName(column = "Population")
    private String Population;
    @CsvBindByName(column = "AreaInSqKm")
    private String AreaInSqKm;
    @CsvBindByName(column = "DensityPerSqKm")
    private String DensityPerSqKm;

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    public String getAreaInSqKm() {
        return AreaInSqKm;
    }

    public void setAreaInSqKm(String areaInSqKm) {
        AreaInSqKm = areaInSqKm;
    }

    public String getDensityPerSqKm() {
        return DensityPerSqKm;
    }

    public void setDensityPerSqKm(String densityPerSqKm) {
        DensityPerSqKm = densityPerSqKm;
    }

    @Override
    public String toString() {
        return "StateCensus{" +
                "State='" + State + '\'' +
                ", Population='" + Population + '\'' +
                ", AreaInSqKm='" + AreaInSqKm + '\'' +
                ", DensityPerSqKm='" + DensityPerSqKm + '\'' +
                '}';
    }
}
