package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClassDemo {
    public static void main(String[] args) throws Exception {
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Elementry",
                "root",
                "Sreenu@Mysql"
            );
            
            

            // INSERT
            String insertSQL = "INSERT INTO Boys(id, name) VALUES(?, ?)";
            PreparedStatement pst1 = con.prepareStatement(insertSQL);
            pst1.setInt(1, 6);
            pst1.setString(2, "Govind");
            pst1.executeUpdate();
            
            int rows = pst1.executeUpdate();
            System.out.println(rows+"Rows are affercted");
            

            
            
            // SELECT
//            String selectSQL = "SELECT * FROM Boys";
//            PreparedStatement pst2 = con.prepareStatement(selectSQL);
//            ResultSet rs = pst2.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
//            }
            
            

            // UPDATE
//            String updateSQL = "UPDATE Boys SET name=? WHERE id=?";
//            PreparedStatement pst3 = con.prepareStatement(updateSQL);
//            pst3.setString(1, "Updated");
//            pst3.setInt(2, 4);
//            pst3.executeUpdate();
            
            

            // DELETE
//            String deleteSQL = "DELETE FROM Boys WHERE id=?";
//            PreparedStatement pst4 = con.prepareStatement(deleteSQL);
//            pst4.setInt(1, 4);
//            pst4.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}