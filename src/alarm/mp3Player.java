/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author vinnu
 */
public class mp3Player implements Runnable{
Player plyr;
    public mp3Player(File filoc) throws FileNotFoundException, JavaLayerException {
        FileInputStream f1=new FileInputStream(filoc);
        BufferedInputStream bi=new BufferedInputStream(f1);
        plyr=new Player(bi);
    }
    public void run(){
    try {
        plyr.play();
    } catch (JavaLayerException ex) {
        Logger.getLogger(mp3Player.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
}
