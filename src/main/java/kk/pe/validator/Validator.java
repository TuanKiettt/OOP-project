package kk.pe.validator;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JTextField;

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
}
