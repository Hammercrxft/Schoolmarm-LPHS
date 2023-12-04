/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm.types;

/**
 *
 * @author fille
 */
public class Section {

    private String advisoryTeacher;
    private String section;

    public Section(int gradeLevel, String sectionName, String the_advisoryTeacher) {
        section = "" + gradeLevel + sectionName;
        advisoryTeacher = the_advisoryTeacher;
    }
    
    public Section(String sectionGradeAndName, String the_advisoryTeacher) {
        section = sectionGradeAndName;
        advisoryTeacher = the_advisoryTeacher;
    }

    public int getGradeLevel() {
        String[] splitted = section.split("\\s+");
        return Integer.parseInt(splitted[0]);
    }

    public String getSectionNameOnly() {
        String[] splitted = section.split("\\s+");
        StringBuilder sb = new StringBuilder();
        boolean gradeLevelSkipped = false;
        for (String token : splitted) {
            if (!gradeLevelSkipped) {
                gradeLevelSkipped = true;
                continue;
            }
            sb.append(token);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return section;
    }

    public String getAdvisoryTeacher() {
        return advisoryTeacher;
    }

    public void setAdvisoryTeacher(String advisoryTeacher) {
        this.advisoryTeacher = advisoryTeacher;
    }

    public void set(int gradeLevel, String sectionName, String the_advisoryTeacher) {
        section = "" + gradeLevel + sectionName;
        advisoryTeacher = the_advisoryTeacher;
    }

}
