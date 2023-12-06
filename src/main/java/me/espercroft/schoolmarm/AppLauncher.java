package me.espercroft.schoolmarm;

import com.formdev.flatlaf.FlatIntelliJLaf;
import io.github.imsauce.Frame.Main;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import javax.swing.JFrame;
import javax.swing.UIManager;
import me.espercroft.schoolmarm.eventhandlers.HTMLGuiPostRequestHandler;
import me.espercroft.util.HandlerAlreadyBoundException;

public class AppLauncher {

    public static Schoolmarm marm;
    public static HttpUserInterface ui;

    public static void main(String args[]) throws HandlerAlreadyBoundException, IOException {
        marm = new Schoolmarm();
        
        marm.getEventService().bind(new HTMLGuiPostRequestHandler());
        
        ui = new HttpUserInterface(marm);
        
        //TODO make a lightweight chromium build, or find a way to recognize and run the system's default browser
        Runtime.getRuntime().exec("C:\\SchoolmarmRegistryData\\chrome-win\\chrome.exe --app=http://localhost:52394/");
        
        //-------------[init GUI]------------- 
//        JFrame frame = new JFrame();
//        FlatIntelliJLaf.registerCustomDefaultsSource("style");
//        FlatIntelliJLaf.setup();
//        UIManager.put("TitlePane.unifiedBackground", false);
//        UIManager.getColor("Label.disabledForeground");
//        //UIManager.put("TitlePane.titleForeground", new java.awt.Color(255, 255, 255));
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Main().setVisible(true);
//            }
//        });
        //-------------[end of GUI init code]-------------
    }
}
