/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author vinnu
 */
public class IsTime {
    Calendar cal=GregorianCalendar.getInstance();
    mp3Player m1=new mp3Player();
        Thread t1=new Thread(m1);
    void setCal(int hr,int mi,int ap) throws InterruptedException{
        
        cal.set(Calendar.HOUR, hr);
        cal.set(Calendar.MINUTE, mi);
        cal.set(Calendar.AM_PM, ap);
        if((cal.getTimeInMillis()-System.currentTimeMillis())<0)
            
            cal.set(Calendar.HOUR,hr+24);
        gtSleep(cal);
    }
    void gtSleep(Calendar c) throws InterruptedException{
        
        t1.sleep(c.getTimeInMillis()-System.currentTimeMillis());
        t1.start();
        Alarm_Clock.set.setText("Stop");
        
    }
    
    
}
