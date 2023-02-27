/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class UserDB {

    static String userID = "sa";
    static String password = "sa";

    public static Connection getConnect() throws Exception {
        String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=StudentTBL;" + "encrypt=false";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("oknhe");
        return DriverManager.getConnection(url, userID, password);
    }

    public static int getSize() {
        try {
            String query = "Select count(*) from formDk";
            Connection con = UserDB.getConnect();
            PreparedStatement pr = con.prepareStatement(query);
            ResultSet set = pr.executeQuery();
            int size = 0;
            while (set.next()) {
                size = set.getInt(1);
            }
            con.close();

            return size;
        } catch (Exception ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static void getList() {
        try {
            String query = "Select * from formDk";
            Connection con = UserDB.getConnect();
            PreparedStatement pr = con.prepareStatement(query);
            ResultSet set = pr.executeQuery();

            while (set.next()) {
                System.out.println(set.getString(1) + " " + set.getString(2) + " " + set.getBoolean(3) + " " + set.getString(4) + " " + set.getString(5) + " " + set.getString(6) + " " + set.getString(7) + " " + set.getString(8) + " ");
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<User> getAll() {
        try {
            ArrayList<User> list = new ArrayList<>();
            String query = "Select * from formDk";
            Connection con = UserDB.getConnect();
            PreparedStatement pr = con.prepareStatement(query);
            ResultSet set = pr.executeQuery();
            while (set.next()) {
                String id = set.getString(1);
                String ten = set.getString(2);
                boolean gioiTinh = set.getBoolean(3);
                String ngaySinh = set.getString(4);
                String quocTich = set.getString(5);
                String diaChi = set.getString(6);
                String dienThoai = set.getString(7);
                String nganhHoc = set.getString(8);
                User newUser = new User(id, ten, gioiTinh, ngaySinh, quocTich, diaChi, dienThoai, nganhHoc);
                list.add(newUser);
            }
            con.close();
            return list;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

    public static void insertUser(User user) {
        try {
            ArrayList<User> list = new ArrayList<>();
            String query = "insert into formDk values\n" + "(?,?,?,?,?,?,?,?)";
            //insert into formDk values('DE160023',N'Nguyễn Như Ngọc',1,'12-2-2002','Viet Nam','Da Nang','0123456789',N'Kinh tế')

            Connection con = UserDB.getConnect();
            PreparedStatement pr = con.prepareStatement(query);

            pr.setString(1, user.getId());
            pr.setString(2, user.getTen());
            pr.setBoolean(3, user.isGioiTinh());
            pr.setString(4, user.getNgaySinh());
            pr.setString(5, user.getQuocTich());
            pr.setString(6, user.getDiaChi());
            pr.setString(7, user.getDienThoai());
            pr.setString(8, user.getNganhHoc());

            pr.executeUpdate();
            con.commit();
            con.close();

        } catch (Exception e) {
            System.out.println("Error Insert UserDB " + e);
        }
    }

    public static User findUser(String findID) {
        User user = null;
        try {
            String query = "Select * from formDk where id=?";
            Connection con = UserDB.getConnect();
            PreparedStatement pr = con.prepareStatement(query);
            pr.setString(1, findID);
            ResultSet set = pr.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String ten = set.getString(2);
                boolean gioiTinh = set.getBoolean(3);
                String ngaySinh = set.getString(4);
                String quocTich = set.getString(5);
                String diaChi = set.getString(6);
                String dienThoai = set.getString(7);
                String nganhHoc = set.getString(8);
                user = new User(id, ten, gioiTinh, ngaySinh, quocTich, diaChi, dienThoai, nganhHoc);
            }
            con.close();

            return user;
        } catch (Exception ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        //insert into formDk values('DE160023',N'Nguyễn Như Ngọc',1,'12-2-2002','Viet Nam','Da Nang','0123456789',N'Kinh tế')
//        User newUser = new User("DE160023", "Nguyễn Như Ngọc", true, "12-2-2002", "Viet Nam", "Da Nang", "0123456789", "Kinh tế");
//        insertUser(newUser);
        User user =findUser("DE160293");
        System.out.println(user);
//        for (User user: getAll() ) {
//            System.out.println(user);
//        }
    }

}
