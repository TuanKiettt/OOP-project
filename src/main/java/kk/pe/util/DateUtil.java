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
