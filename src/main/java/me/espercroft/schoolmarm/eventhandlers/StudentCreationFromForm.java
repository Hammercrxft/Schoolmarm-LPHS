/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm.eventhandlers;

import com.sun.net.httpserver.HttpExchange;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.espercroft.schoolmarm.Schoolmarm;
import me.espercroft.schoolmarm.types.Student;
import me.espercroft.util.Configuration;
import me.espercroft.util.Event;
import me.espercroft.util.EventHandler;
import me.espercroft.util.RudimentaryConfig;

/**
 *
 * @author Kurt Emmanuel
 */
public class StudentCreationFromForm implements EventHandler{

    @Override
    public String getTriggeringEvent() {
        return "http_ui.createstudent";
    }

    @Override
    public Runnable createTask(Event evt) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                Event event = evt;
                Schoolmarm marm = (Schoolmarm) event.eventData.get(0);
                Map<String, String> postBody = (Map<String,String>) event.eventData.get(1);
                
                Student student;
                String directoryName = "\\"+postBody.get("lrn")+"_"+postBody.get("fname");
                File studentDirectory = new File(marm.masterIndexDirectory.toString()+directoryName);
                studentDirectory.mkdir();
                File studentDataFile = new File(studentDirectory+"\\student.cfg");
                try {
                    studentDataFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(StudentCreationFromForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                Configuration config = RudimentaryConfig.newBlank(studentDataFile);
                try{
                    student = new Student(Long.parseLong(postBody.get("lrn")), UUID.randomUUID().toString());
                }
                catch(Exception owch){
                    owch.printStackTrace();
                }
            }
        };
        return task;
    }

    @Override
    public String getHandlerName() {
        return this.getClass().toString();
    }
    
}
