
package bank.management.system;
import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try{
            
            //c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "radi", "1316511410");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "1316511410");
            s = c.createStatement();
            
        
        } catch (Exception e) {
            System.out.println(e);
        }
    
    
    }
    
}
