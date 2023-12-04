/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm.types;

/**
 *
 * @author fille
 */
public class GivenName {

    public GivenName(String firstName, String MiddleName, String LastName, String suffix) {
        this.firstName = firstName;
        this.middleName = MiddleName;
        this.lastName = LastName;
        this.suffix = suffix;
    }

    @Override
    public String toString() {
    	if (suffix != null && !suffix.isBlank() && !suffix.equals("null"))
    		return ""+firstName+ " " + middleName+ " " + lastName;
    	else
    		return ""+firstName+ " " + middleName+ " " + lastName+ " " + suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String MiddleName) {
        this.middleName = MiddleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }
    
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    String firstName;
    String middleName;
    String lastName;
    String suffix;

   
}
