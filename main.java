/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelduadpp;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kelduadpp.db.DBKoneksiDPP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import kelduadpp.db.DPPRepository;

/**
 *
 * @author Asus
 */
public class main {
    public static void main(String[] args) throws SQLException{
        
            Connection connection = DBKoneksiDPP.getConnection();
            
            DPPRepository repo = new DPPRepository(connection);
            List<String> users = repo.getAllUser();
            
            for (String user : users) {
                System.out.println(user);
        }
            
    }
}
