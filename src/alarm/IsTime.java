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
    void setCal(int hr,int mi) throws InterruptedException{
        cal.set(Calendar.HOUR_OF_DAY, hr+12);
        cal.set(Calendar.MINUTE, mi);
        gtSleep(cal);
    }
    void gtSleep(Calendar c) throws InterruptedException{
        Thread t1=new Thread();
        t1.sleep(c.getTimeInMillis()-System.currentTimeMillis());
        new mp3Player().run();
        
    }
    
}
