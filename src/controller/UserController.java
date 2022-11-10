package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;
import utils.MySQL;

public class UserController {
    MySQL conn = new MySQL();
    
    public UserController() {
        this.conn.conectaBanco();
    }
    
    public int addUser(User user) {
        String sql = "INSERT INTO Usuario VALUES("
                + "null, "
                + "'" + user.getUsername() + "', "
                + "'" + user.getPassword()+ "', "
                + "'" + user.getName()+ "'); ";
        return this.conn.insertSQL(sql);
    }
    
    public ResultSet login(String username, String password) throws SQLException {
        String sql = "SELECT * FROM Usuario WHERE "
                + "login_usuario = '" + username + "' AND "
                + "senha_usuario = '" + password + "';";
        this.conn.executarSQL(sql);
        
        return this.conn.getResultSet();
        
//        User user = new User();
//        while (this.conn.getResultSet().next()) {
//            user.setName(this.conn.getResultSet().getString("nome_usuario"));
//            user.setUsername(this.conn.getResultSet().getString("login_usuario"));
//            user.setPassword(this.conn.getResultSet().getString("senha_usuario"));
//        }
//        
//        return user;
    }

}
