<<<<<<< HEAD
package kk.pe.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public String pattern;
    private final SimpleDateFormat sdf;

    public DateUtil() {
        this.pattern = "dd/MM/yyyy"; // Corrected date format
        this.sdf = new SimpleDateFormat(pattern); // Set pattern to SimpleDateFormat
    }
    
    public String toString(Date date){
        return sdf.format(date);
    }
    
    public Date toDate(String stDate) throws ParseException{
        return sdf.parse(stDate);
    }
}
=======
package kk.pe.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public String pattern = "dd/MM/yyyy";
    private SimpleDateFormat sdf = new SimpleDateFormat();
    
    public String toString(Date date){
        return sdf.format(date);
    }
    
    public Date toDate(String stDate) throws ParseException{
        return sdf.parse(stDate);
    }
}
>>>>>>> 87fd15a166746b6b145b7771de6966b53a66022e
