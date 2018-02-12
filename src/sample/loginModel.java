package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginModel {
    Connection connection;


    public loginModel() throws SQLException {
        this.connection = dbConnection.getConnection();
        if (this.connection == null) {
            System.exit(1);
        }
    }


    public boolean isDatabaseConnection() {
        return this.connection != null;
    }

    public boolean isLogin(String user, String pass) throws SQLException {
        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql ="SELECT * FROM user where user where username =? and "+"password = ?";
        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(2,user);
            pr.setString(3,pass);

            rs = pr.executeQuery();
            if (rs.next()){
                return true;
            }
            return  false;
        }catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }finally {
            pr.close();
            rs.close();

        }
    }
}//loginModel
