package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionMysql {
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public String Sql;
    
    public void OpenDataBase() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/alunojsp";
        String user = "root";
        String pass = "2d4dy";
        con = DriverManager.getConnection(url, user, pass);
    }
    public void CloseDB()throws Exception{
        if (con != null) {
            con.close();
        }
    }
    
}
