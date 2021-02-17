
package calenderpractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalenderPractice {

    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println(cal.getTime());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        String formattedDate = dateFormat.format(cal.getTime());
        System.out.println(formattedDate);
    }
    
}
