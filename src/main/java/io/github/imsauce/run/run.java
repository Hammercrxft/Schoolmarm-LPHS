
package io.github.imsauce.run;

import io.github.imsauce.Frame.Main;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class run {

  
    public static void main(String[] args) {
       
        JFrame frame = new JFrame();
        
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        UIManager.put("TitlePane.unifiedBackground", false);
        UIManager.getColor("Label.disabledForeground");
        
      
        
        
        //UIManager.put("TitlePane.titleForeground", new java.awt.Color(255, 255, 255));
        
        
        
        
        
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
}
