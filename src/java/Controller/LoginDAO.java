
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    
    public static boolean validate(String uname,String pass)
    {
        boolean status=false;
        String url = "jdbc:mysql://localhost:3306/website?user=root&password=arun4&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true";
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url);
            
             String q = "select username,password from register where username = ? and password=?";
             
            PreparedStatement pstmt = con.prepareStatement(q);
            
            pstmt.setString(1, uname);
 
            pstmt.setString(2, pass);
            
            ResultSet rs=pstmt.executeQuery();  
            
            status=rs.next();  
            
            con.close(); 
           }
        
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
}
