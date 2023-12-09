package me.espercroft.schoolmarm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.espercroft.schoolmarm.types.GivenName;
import me.espercroft.schoolmarm.types.Section;
import me.espercroft.schoolmarm.types.Student;
import me.espercroft.util.Configuration;
import me.espercroft.util.Event;

import me.espercroft.util.EventService;
import me.espercroft.util.RudimentaryConfig;

public class Schoolmarm {

    public final File masterIndexDirectory = new File("C:\\SchoolmarmRegistryData\\master");
    private final ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
    private volatile EventService eventSvc = new EventService(tpe);
    private volatile Map<String, Student> masterIndex = new HashMap<>();
    public volatile long sessionDataVersion = 0;

    public Map<String, Student> getMasterIndex() {
        return masterIndex;
    }

    public EventService getEventService() {
        return eventSvc;
    }

    void initialize() {
        List<Object> args = new ArrayList<>();
        args.add(this);
        eventSvc.fire(new Event(
                "marm.initialization_tasks",
                this.getClass().toString(),
                args
        ));
    }
    
    public static Student loadFromStudentDirectory(File studentDirectory) throws IOException{
        Student student;
        File summaryFile = new File(studentDirectory.toString()+"\\student.cfg");
        Configuration config = RudimentaryConfig.readFromFile(summaryFile);
        student = new Student(Long.parseLong(config.fetch("data.lrn")),config.fetch("data.uuid"));
        student.setName(new GivenName(
                config.fetch("data.given_name.first_name"),
                config.fetch("data.given_name.middle_name"),
                config.fetch("data.given_name.last_name"),
                config.fetch("data.given_name.suffix")
        ));
        student.setDateOfBirth(new Date(
                Integer.parseInt(config.fetch("data.date_of_birth.year")),
                Integer.parseInt(config.fetch("data.date_of_birth.month")),
                Integer.parseInt(config.fetch("data.date_of_birth.day"))
        ));
        student.setSexuality(Student.Sex.valueOf(config.fetch("data.sex").toUpperCase()));
        student.setHomeAddress(config.fetch("data.address"));
        student.setContactNumber(config.fetch("data.contact_number"));
        student.setParentGuardianName(config.fetch("data.parent_guardian_name"));  
        student.setParentGuardianContact(config.fetch("data.parent_guardian_contact"));
        student.setSection(new Section(config.fetch("data.section"),config.fetch("data.advisory_teacher")));
        return student;
    }
}
