package org.itmo.java.lesson3.homework3;

import java.time.Year;

public class House {
    private Integer numberFloors;
    private Integer buildHouseYear;
    private String nameHouse;

    public void setHouse(Integer numberFloors, Integer buildHouseYear, String nameHouse) {
        this.numberFloors = numberFloors;
        this.buildHouseYear = buildHouseYear;
        this.nameHouse = nameHouse;
    }

    public String printHouse() {
        return "Number of floors: " + numberFloors + ", year of build: " + buildHouseYear + ", name of building: " + nameHouse;
    }

    public int yearFromBuild() {
        return Year.now().getValue() - this.buildHouseYear;
    }
}