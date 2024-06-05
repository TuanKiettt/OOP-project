
package kk.pe.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import kk.pe.entity.ExpenditureType;
import kk.pe.util.DatabaseUtil;

public class ExpenditureTypeDao {
    public ExpenditureType insert (ExpenditureType entity) throws Exception {
// Chỉ thao tác vào trường dữ liệu Name vì ID là trường tự tăng        
        String sql = "insert into expenditureType(name) values(?) ";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS);){
//Thiết lập giá trị cho tham số ? trong values của hàm trên           
            pstmt.setString(1,entity.getName());           
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
    
    public ExpenditureType update (ExpenditureType entity) throws Exception {
// Chỉ thao tác vào trường dữ liệu Name vì ID là trường tự tăng        
        String sql = "update expenditureType set name= ? where id = ? ";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
//Thiết lập giá trị cho tham số ? trong values của hàm trên           
            pstmt.setString(1,entity.getName());  
            pstmt.setInt(2,entity.getId());
// Sau khi thực hiện lệnh mới có giá trị của trường ID           
            pstmt.executeUpdate();
            return entity;
        }
    }
    
    public boolean delete (int id) throws Exception {
// Chỉ thao tác vào trường dữ liệu Name vì ID là trường tự tăng        
        String sql = "delete from ExpenditureType where id = ? ";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);){
//Thiết lập giá trị cho tham số ? trong values của hàm trên           
            pstmt.setInt(1,id);  

            return pstmt.executeUpdate()>0;
        }
    }
    
    public List<ExpenditureType> findAll () throws Exception {
// Cho phép đọc tất cả dữ liệu từ ExpenditureType        
        String sql = "select * from ExpenditureType ";
//-----------------------------------------------------------------------------------------//

// Để có thể lấy được giá trị của trường tự tăng thì phải có tham số thứ 2 truyền vào PreparedStatement
        try(Connection con = DatabaseUtil.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);){         
            
            List<ExpenditureType> list = new ArrayList<>();
            
            try(ResultSet rs = pstmt.executeQuery();){
//          Đọc giá trị từng hàng
                while (rs.next()){
                    ExpenditureType entity = new ExpenditureType();
                    entity.setId(rs.getInt("id"));
                    entity.setName(rs.getString("name"));
                    
                    list.add(entity);
                }
            }
            return list;
        }
    }
}
