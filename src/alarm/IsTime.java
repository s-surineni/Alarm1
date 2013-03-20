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
    Calendar cal=Calendar.getInstance();
    mp3Player m1=new mp3Player();
        Thread t1=new Thread(m1);
    void setCal(int hr,int mi,int ap) throws InterruptedException{
        cal.set(Calendar.AM_PM, ap);
        if((ap==1)&hr==12){
            cal.set(Calendar.HOUR_OF_DAY, 12);
            System.out.println("got into if");
            
        }
        else{
        cal.set(Calendar.HOUR, hr);
         System.out.println("else");}
        System.err.println("ampm "+ap);
        
        System.out.println("hour "+cal.get(cal.HOUR_OF_DAY)+" day "+cal.get(cal.DATE));
        
        cal.set(Calendar.MINUTE, mi);
        
          
        
        if((cal.getTimeInMillis()-System.currentTimeMillis())<0)
            
            cal.set(Calendar.HOUR_OF_DAY,hr+24);
        System.out.println("hour gt sleep "+cal.get(cal.HOUR_OF_DAY)+" day "+cal.get(cal.DATE));
        System.err.println(cal.getTimeInMillis()-System.currentTimeMillis());
        
        t1.sleep(cal.getTimeInMillis()-System.currentTimeMillis());
        t1.start();
        Alarm_Clock.set.setText("Stop");
        
    }
    
    
    
}
