package OOP;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;                                                                                                                                                                                                                                                                                            
/**
 *
 * @author Admin
 */
public class DBConnect {

    public static Connection getJDBCConnection(){
        
        String url = "jdbc:mysql://localhost:3306/oop";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                return DriverManager.getConnection(url, "root", "0908250");
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    public static void main(String[] args){
        Connection conn = getJDBCConnection();
        if(conn != null){
            System.out.println("Done");
        }
        else{
            System.out.println("Faile");
        }
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM phieunhap;");
            while (rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}