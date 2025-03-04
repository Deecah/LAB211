package week6.Worker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

    String url = "jdbc:sqlserver://DICA\\SQLEXPRESS:1433;databaseName=WorkerManagement;encrypt=false";
    String userName = "sa";
    String password = "123";

    public void connect() {
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            System.out.println("Kết nối thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateSalary(){
        
    }
    public void addWorker(){
        Worker w = new Worker();
        
    }
    public void showAdjustedWorker(){
        
    }
}
