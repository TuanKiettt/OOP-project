package kk.pe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import kk.pe.entity.Expenditure;
import kk.pe.entity.ExpenditureType;
import kk.pe.util.DatabaseUtil;

public class ExpenditureDao {
    public Expenditure insert (Expenditure entity) throws Exception {
// Chỉ thao tác vào trường dữ liệu Name vì ID là trường tự tăng        
        String sql = "insert into Expenditures(name, amount, note, expenditureDate, type)"
                + " values(?, ?, ?, ?, ?) ";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS);){
//Thiết lập giá trị cho tham số ? trong values của hàm trên           
            pstmt.setString(1,entity.getName()); 
            pstmt.setDouble(2,entity.getAmount());
            pstmt.setString(3, entity.getNote());
            java.sql.Date date = new Date(entity.getExpenditureDate().getTime());
            pstmt.setDate(4,date);
            pstmt.setInt(5, entity.getType());
// Sau khi thực hiện lệnh mới có giá trị của trường ID           
            pstmt.executeUpdate();
// Lấy các KEYS được sinh ra và thiết lập cho setID và trả về giá trị entity            
            ResultSet rs = pstmt.getGeneratedKeys();
            
            if(rs.next()){
                entity.setId(rs.getInt(1));
            }
            
            return entity;
        }
    }
}
