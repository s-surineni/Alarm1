/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vinnu
 */
public class Alarm_Clock {
    static JFrame backFrame=new JFrame("Alarm");

    
    public static void main(String[] args) {
        JPanel backPane=new JPanel();
        backFrame.add(backPane);
        backFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backFrame.pack();
        backFrame.setVisible(true);
        
    }
}
