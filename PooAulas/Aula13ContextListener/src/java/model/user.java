/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author rlarg
 */
public class User {
    private String username;
    private long passwordHash;
    private String name;
    
    public static User getUser(String username, String password) throws Exception{
        User user = null;
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:mytasks.db";
        Connection con = DriverManager.getConnection(url);
        PreparedStatement stmt = con.prepareStatement(
            "select * from users where username = ? and pass_hash = ?"
        );
        stmt.setString(1, username);
        stmt.setLong(2, (username+password).hashCode());
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
            user = new User(
                    rs.getString("username"), 
                    rs.getLong("pass_hash"), 
                    rs.getString("name")
            );
        }
        rs.close(); stmt.close(); con.close();
        return user;
    }
    
    public static ArrayList<User> getAllUsers() throws Exception{
        ArrayList<User> list = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:mytasks.db";
        Connection con = DriverManager.getConnection(url);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery
        ("select * from users order by name");
        while(rs.next()){
            list.add(new User(
                    rs.getString("username"), 
                    rs.getLong("pass_hash"), 
                    rs.getString("name")
            ));
        }
        rs.close(); stmt.close(); con.close();
        return list;
    }

    public User(String username, long passwordHash, String name) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(long passwordHash) {
        this.passwordHash = passwordHash;
    }
    
}