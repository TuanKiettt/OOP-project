<<<<<<< HEAD
package kk.pe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
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
    
    public boolean update (Expenditure entity) throws Exception {       
        String sql = "update Expenditures set"
                + " name = ?, amount = ?, note = ?, expenditureDate = ?, type = ?"
                + " where id = ? ";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
//Thiết lập giá trị cho tham số ? trong values của hàm trên           
            pstmt.setString(1,entity.getName()); 
            pstmt.setDouble(2,entity.getAmount());
            pstmt.setString(3, entity.getNote());
            java.sql.Date date = new Date(entity.getExpenditureDate().getTime());
            pstmt.setDate(4,date);
            pstmt.setInt(5, entity.getType());
// Sau khi thực hiện lệnh mới có giá trị của trường ID   
            
            pstmt.setInt(6,entity.getId());

            return pstmt.executeUpdate() > 0;
        }
    }
    
        public boolean delete (int id) throws Exception {       
        String sql = " delete from expenditures where id = ? ";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);){ 
            
            pstmt.setInt(1,id);

            return pstmt.executeUpdate() > 0;
        }
    }
        
        public List<Expenditure> findAll () throws Exception {
// Cho phép đọc tất cả dữ liệu từ ExpenditureType        
        String sql = "select * from Expenditures ";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);){         
            
            List<Expenditure> list = new ArrayList<>();
            
            try(ResultSet rs = pstmt.executeQuery();){
//          Đọc giá trị từng hàng
                while (rs.next()){
                    Expenditure entity = new Expenditure();
                    entity.setId(rs.getInt("id"));
                    entity.setName(rs.getString("name"));
                    entity.setAmount(rs.getDouble("amount"));
                    entity.setExpenditureDate(rs.getDate("expenditureDate"));
                    entity.setNote(rs.getString("note"));
                    entity.setType(rs.getInt("type"));
                    
                    list.add(entity);
                }
            }
            return list;
        }
    }
        
        public Expenditure findById (int id) throws Exception {    
        String sql = "select * from Expenditures where id = ?";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);){         
            
            pstmt.setInt(1,id);

            try(ResultSet rs = pstmt.executeQuery();){
//          Đọc giá trị từng hàng
                if (rs.next()){
                    Expenditure entity = new Expenditure();
                    entity.setId(rs.getInt("id"));
                    entity.setName(rs.getString("name"));
                    entity.setAmount(rs.getDouble("amount"));
                    entity.setExpenditureDate(rs.getDate("expenditureDate"));
                    entity.setNote(rs.getString("note"));
                    entity.setType(rs.getInt("type"));
                    
                    return entity;
                }
            }
            return null;
        }
    }
}
=======
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
>>>>>>> 87fd15a166746b6b145b7771de6966b53a66022e
