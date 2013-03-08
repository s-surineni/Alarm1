/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author vinnu
 */
public class Alarm_Clock {
    static JFrame backFrame=new JFrame("Alarm");

    
    public static void main(String[] args) {
        JLabel time=new JLabel("00:00:00");
        //JPanel backPane=new JPanel();
        //JPanel timeHold=new JPanel();
        //timeHold.add(time);
        //backPane.add(timeHold);
        //backFrame.add(backPane);
        backFrame.add(time);
        backFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backFrame.pack();
        backFrame.setVisible(true);
        
    }
}
