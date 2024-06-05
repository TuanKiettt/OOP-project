package kk.pe.validator;

import java.awt.Color;
import javax.swing.JTextField;
import kk.pe.util.MessageBox;

public class ExpenditureTypeValidator {
    public static String validate(JTextField txtName){
        StringBuilder sb = new StringBuilder();
            
        if(Validator.isEmpty(txtName)){
            sb.append("Name must be entered");
        }
        
        return sb.isEmpty()? null : sb.toString();
    }
}
