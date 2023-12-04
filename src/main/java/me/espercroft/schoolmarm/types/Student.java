package me.espercroft.schoolmarm.types;

import java.io.File;
import java.util.Date;
import java.util.EnumSet;
import java.util.UUID;

/**
 * 
 * This class stores references to a student's scanned documents, and also
 * represents a student's general profile.
 * <p>
 * Warning: PLEASE INITIALIZE ALL FIELDS BEFORE PUTTING INTO MASTER LIST!
 * UserInterface implementations are not expected to handle null values.
 * </p>
 *
 * @author fille
 */
public class Student {

    public final UUID uuid; //will act as unique discriminator system-wide (that includes the archive!)
    public final long lrn; //will act as unique identification in the master list
    private SchoolYear schoolYear;
    private GivenName name;
    private Date dateOfBirth;
    private String homeAddress;
    private Sex sexuality;
    private Section section;
    private String contactNumber;
    private String emailAddress;
    private String parentGuardianName;
    private String parentGuardianContact;
    private EnumSet<Tags> tags = EnumSet.noneOf(Tags.class); //this is a SET! i can have multiple unique things!
    private File[] documents;
    private File dataFile;

    public enum Sex {
        MALE,
        FEMALE
    }

    public enum Tags {
        INBOUND_TRANSFEREE, //para master & transferee
        OUTBOUND_TRANSFEREE, //para archive & transferee
        FAILED, //para archive
        GRADUATE, //para archive
        COMPLETE,
        INCOMPLETE,
    }

    /**
     * @param lrn
     */
    public Student(long lrn) {
        this.lrn = lrn;
        this.uuid = UUID.randomUUID();
    }
    
    public Student(long lrn, String uuid) {
        this.lrn = lrn;
        this.uuid = UUID.fromString(uuid);
    }


    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }

    public GivenName getName() {
        return name;
    }

    public void setName(GivenName name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String HomeAddress) {
        this.homeAddress = HomeAddress;
    }

    public Sex getSexuality() {
        return sexuality;
    }

    public void setSexuality(Sex sexuality) {
        this.sexuality = sexuality;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getParentGuardianName() {
        return parentGuardianName;
    }

    public void setParentGuardianName(String ParentGuardianName) {
        this.parentGuardianName = ParentGuardianName;
    }

    public String getParentGuardianContact() {
        return parentGuardianContact;
    }

    public void setParentGuardianContact(String ParentGuardianContactAddress) {
        this.parentGuardianContact = ParentGuardianContactAddress;
    }

    public long getLrn() {
        return lrn;
    }

    public EnumSet<Tags> getTags() {
        return tags;
    }

    public void setTags(EnumSet<Tags> tags) {
        this.tags = tags;
    }

    public File[] getDocuments() {
        return documents;
    }

    public void setDocuments(File[] documents) {
        this.documents = documents;
    }

    public File getDataFile() {
        return dataFile;
    }

    public void setDataFile(File data) {
        this.dataFile = data;
    }
}

