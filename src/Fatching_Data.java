
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Fatching_Data {
    
   public ResultSet Find(String st){
        Connection con = MyConnaction.getConnaction();
        ResultSet rs = null;
        PreparedStatement ps =null;
       try {
           ps = con.prepareStatement("SELECT * FROM `anis` WHERE `username`=?");
           ps.setString(1, st);
           rs = ps.executeQuery();
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Fatching_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
       return rs;
   }
}
