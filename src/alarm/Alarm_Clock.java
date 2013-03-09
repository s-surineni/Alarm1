/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import javax.swing.BoxLayout;
import javax.swing.JButton;
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
        
        JPanel backPane=new JPanel();
        JPanel timeHold=new JPanel();
        JPanel bottom=new JPanel ();
        JButton set=new JButton("Set");
        
        bottom.add(set);
        backPane.setLayout(new BoxLayout(backPane, BoxLayout.Y_AXIS));
        backPane.add(timeHold);
        backPane.add(bottom);
        backFrame.add(backPane);
        backFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backFrame.pack();
        backFrame.setVisible(true);
        
    }
}
