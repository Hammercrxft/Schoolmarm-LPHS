/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.espercroft.schoolmarm.eventhandlers;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.espercroft.schoolmarm.Schoolmarm;
import static me.espercroft.schoolmarm.Schoolmarm.loadFromStudentDirectory;
import me.espercroft.schoolmarm.types.Student;
import me.espercroft.util.Event;
import me.espercroft.util.EventHandler;

/**
 *
 * @author fille
 */
public class MarmInitializationTasksHandler implements EventHandler {

    @Override
    public String getTriggeringEvent() {
        return "marm.initialization_tasks";
    }

    @Override
    public Runnable createTask(Event evt) {
        Schoolmarm marm = (Schoolmarm) evt.eventData.get(0);
        Runnable runnable = () -> {
            File[] studentDirectories = marm.masterIndexDirectory.listFiles();
            if (studentDirectories != null) {
                for (File dir : studentDirectories) {
                    if (dir.isDirectory()){
                        Student student;
                        try {
                            System.out.println(dir);
                            student = loadFromStudentDirectory(dir);
                            marm.getMasterIndex().put(Long.toString(student.getLrn()), student);
                        } catch (IOException ex) {
                            Logger.getLogger(Schoolmarm.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                marm.sessionDataVersion++;
            } else {
                
            }
        };
        return runnable;
    }

    @Override
    public String getHandlerName() {
        return this.getClass().toString();
    }
    
}
