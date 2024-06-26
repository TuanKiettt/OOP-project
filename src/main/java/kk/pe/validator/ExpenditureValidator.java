<<<<<<< HEAD
package kk.pe.validator;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import kk.pe.entity.ExpenditureType;

public class ExpenditureValidator {
        public static String validate(JTextField txtName, JTextField txtAmount,
                JTextField txtDate, JComboBox<ExpenditureType> cbxType){
        StringBuilder sb = new StringBuilder();
            
        if(Validator.isEmpty(txtName)){
            sb.append("Name must be entered\n");
        }
        
        if(Validator.isEmpty(txtAmount)){
            sb.append("Amount must be entered\n");
        }
        
        if(!Validator.isMin(txtAmount,0)){
            sb.append("Amount must be greater than 0 or invalid number\n");
        }
        
        if(Validator.isEmpty(txtDate)){
            sb.append("Date must be entered\n");
        }
        
        if(!Validator.isDate(txtDate)){
            sb.append("Invalid date\n");
        }
        
        return sb.isEmpty()? null : sb.toString();
    }
}
=======
package kk.pe.validator;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import kk.pe.entity.ExpenditureType;

public class ExpenditureValidator {
        public static String validate(JTextField txtName, JTextField txtAmount,
                JTextField txtDate, JComboBox<ExpenditureType> cbxType){
        StringBuilder sb = new StringBuilder();
            
        if(Validator.isEmpty(txtName)){
            sb.append("Name must be entered\n");
        }
        
        if(Validator.isEmpty(txtAmount)){
            sb.append("Amount must be entered\n");
        }
        
        if(Validator.isMin(txtAmount,0)){
            sb.append("Amount must be greater than 0 or invalid number\n");
        }
        
        if(Validator.isEmpty(txtDate)){
            sb.append("Date must be entered\n");
        }
        
        if(!Validator.isDate(txtDate)){
            sb.append("Invalid date\n");
        }
        
        return sb.isEmpty()? null : sb.toString();
    }
}
>>>>>>> 87fd15a166746b6b145b7771de6966b53a66022e
