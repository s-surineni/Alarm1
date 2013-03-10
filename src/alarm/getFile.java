/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author vinnu
 */
public class getFile {
    JFileChooser jc=new JFileChooser();
    String fiLoc;
    File fl;
    void getFile(){
        jc.showDialog(Alarm_Clock.backFrame, "set");
        fl=jc.getSelectedFile();
        fiLoc=fl.getPath();
        System.err.println(fiLoc);
    }
    
}
