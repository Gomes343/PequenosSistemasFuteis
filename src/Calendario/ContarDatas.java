package Calendario;

import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;


public class ContarDatas {
        
    public void DiasEntreDatas(Date d1, Date d2){
        
        
        
    }
    
   
    public static void main(String[]args){
        DateTime dt = new DateTime();
       
        DateTime start = new DateTime(1997, 4, 22, 5, 0, 0);
        
        System.out.println(Days.daysBetween(start.withTimeAtStartOfDay(), dt.withTimeAtStartOfDay()).getDays());
        

        
        
    }
    
    
    
    
    
}
