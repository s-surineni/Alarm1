/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import javax.swing.JFileChooser;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author vinnu
 */
public class getFile {
    JFileChooser jc=new JFileChooser();
    static String fiLoc;
    static File fl;
    void getFile() throws FileNotFoundException, JavaLayerException, IOException{
        jc.showDialog(Alarm_Clock.backFrame, "set");
        fl=jc.getSelectedFile();
        fiLoc=fl.getCanonicalPath();
        
        new mp3Player(fiLoc);
        System.err.println(fiLoc);
        System.err.println("file "+fl);
    }
    
}
