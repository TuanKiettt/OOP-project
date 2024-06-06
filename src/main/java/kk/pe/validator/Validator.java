package kk.pe.validator;

import java.awt.Color;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JTextField;
import kk.pe.util.DateUtil;

public class Validator {
    public static boolean isEmpty(JComponent component){
        if(component instanceof JTextField){
            JTextField txt = (JTextField) component;
            if(txt.getText().equals("")){
                txt.setBackground(Color.yellow);
                return true;
            }else{
                txt.setBackground(Color.white);
            }
        }
        return false;
    }
    
    public static boolean isMin(JComponent component, double min){
        if(component instanceof JTextField){
            JTextField txt = (JTextField) component;
            
            try{
                double value = Double.parseDouble(txt.getText());
                
                if(value >= min){
                    txt.setBackground(Color.white);
                    return true;
                }
                txt.setBackground(Color.yellow);
                
            } catch (Exception e){
                txt.setBackground(Color.yellow);
            }
            
            if(txt.getText().equals("")){
                txt.setBackground(Color.yellow);
                return true;
            }else{
                txt.setBackground(Color.white);
            }
        }
        return false;
    }
    
    public static boolean isDate(JComponent component){
        if(component instanceof JTextField){
            JTextField txt = (JTextField) component;
            
            try{
                DateUtil dateUtil = new DateUtil();
                Date date = dateUtil.toDate(txt.getText());
                
                
                txt.setBackground(Color.white);
                return true;

            } catch (Exception e){
                txt.setBackground(Color.yellow);
            }
            
            if(txt.getText().equals("")){
                txt.setBackground(Color.yellow);
                return true;
            }else{
                txt.setBackground(Color.white);
            }
        }
        return false;
    }
}
