/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm.types;

import java.time.Year;

/**
 *
 * @author fille
 */
public class SchoolYear {

    public SchoolYear(Year startingYear, Year endingYear) {
        this.startingYear = startingYear;
        this.endingYear = endingYear;
    }
    Year startingYear;

    public Year getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(Year startingYear) {
        this.startingYear = startingYear;
    }

    public Year getEndingYear() {
        return endingYear;
    }

    public void setEndingYear(Year endingYear) {
        this.endingYear = endingYear;
    }
    Year endingYear;
}
