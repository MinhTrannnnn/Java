/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AdminDao {
    Connection con=MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
//    public int getMaxRow(){
//        int row=0;
//        try {
//            st=con.createStatement();
//            rs=st.executeQuery("select max(id) from admin");
//            while(rs.next()){
//                row=rs.getInt(1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
}
