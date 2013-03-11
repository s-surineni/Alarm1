/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author vinnu
 */
public class Alarm_Clock {

    static JFrame backFrame = new JFrame("Alarm");
    JComboBox hrs = new JComboBox();
    JComboBox min = new JComboBox();
    JComboBox ampm = new JComboBox();
    JPanel backPane = new JPanel();
    JPanel timeHold = new JPanel();
    JPanel bottom = new JPanel();
    JButton set = new JButton("Set");
    JButton tone=new JButton("Tone");

    public static void main(String[] args) {
        Alarm_Clock a1 = new Alarm_Clock();

        a1.prepInterfc();
        a1.listenAdd();



    }

    void prepInterfc() {
        bottom.add(set);
        bottom.add(tone);
        backPane.setLayout(new BoxLayout(backPane, BoxLayout.Y_AXIS));
        backPane.add(timeHold);
        setCombo(hrs);
        timeHold.add(hrs);
        setCombo1(min);
        timeHold.add(min);
        ampm.addItem("AM");
        ampm.addItem("PM");
        timeHold.add(ampm);
        backPane.add(bottom);
        backFrame.add(backPane);
        backFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backFrame.pack();
        backFrame.setVisible(true);
        

    }
    void listenAdd(){
        set.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int hh = Integer.parseInt(hrs.getSelectedItem().toString());
                int mm = Integer.parseInt(min.getSelectedItem().toString());

                String apm = ampm.getSelectedItem().toString();
                new IsTime().setCal(hh, mm);
            }
        });
        tone.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        new getFile().getFile();
    }});
        
    }

    void setCombo(JComboBox h) {
        for (int f = 0; f <= 12; f++) {
            h.addItem(Integer.toString(f));
        }
        h.setSelectedIndex(Calendar.getInstance().get(Calendar.HOUR));

    }

    void setCombo1(JComboBox h) {
        for (int f = 0; f <= 59; f++) {
            h.addItem(Integer.toString(f));
        }
        h.setSelectedIndex((Calendar.getInstance().get(Calendar.MINUTE) + 1) % 60);
    }

    public void setAmpm(JComboBox ampm) {
        this.ampm = ampm;
    }
}
