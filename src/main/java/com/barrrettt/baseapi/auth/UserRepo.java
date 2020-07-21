package com.barrrettt.baseapi.auth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {

    @Autowired
    private JdbcTemplate plantilla;

    //get 1 by id
    public UserModel getUser(Long id){
        try {
            UserModel user = plantilla.queryForObject(
            "SELECT * FROM users WHERE id = ?",
            new Object[] {id},new UserMapper());
            return user;
        } catch (Exception e) {
            return null;
        }
    }

    //get 1 by name
    public UserModel getUser(String username){
        try {
            UserModel user = plantilla.queryForObject(
            "SELECT * FROM users WHERE username = ?",
            new Object[] {username},new UserMapper());
            return user;
        } catch (Exception e) {
            return null;
        }
    }

    //get all
    public List<UserModel> getAll(){
        return plantilla.query("select * from users", new UserMapper());
    }

    //add new
    public Boolean createUser(UserModel newUser){
        try {
            plantilla.update(
            "INSERT INTO users(username, password, active, roles) VALUES (?,?,?,?)",
            new Object[] {newUser.getName(),newUser.getPassword(),newUser.getActive(),newUser.getRoles()});

            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //delete
    public Boolean deleteUser(String username){
        try {
            int deletecount = plantilla.update("delete from users where username=?",new Object[] {username});
            return (deletecount>0);

        } catch (Exception e) {
            return false;
        }
    }
}

//R->O Mapper
class UserMapper implements RowMapper<UserModel> {
    
    @Override
    public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserModel user = new UserModel(
            rs.getLong("id"),
            rs.getString("username"),
            rs.getString("password"),
            rs.getBoolean("active"),
            rs.getString("roles"));
        return user;
    }
}