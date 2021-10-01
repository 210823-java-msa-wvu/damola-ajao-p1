package com.revature.repos.jdbc;

import com.revature.models.User;
import com.revature.repos.UserRepo;
import com.revature.utils.ConnectionUtil;

import java.util.List;

public class UserJDBC implements UserRepo {

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    public User getByUsername(String username) {
//
//        try (Connection conn = cu.getConnection()) {
//
//            String sql = "select * from users where username = ?";
//
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, username);
//
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                User u = new User(
//                        rs.getInt("id"),
//                        rs.getString("username"),
//                        rs.getString("password")
//                );
//                return u;
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        // try-with-resources - automatically closes resources after execution
////        finally {
////            conn.close();
////        }

        return null;
    }

    @Override
    public List<User> getAll() {
//
//        List<User> users = new ArrayList<User>();
//
//        try (Connection conn = cu.getConnection()) {
//
//            String sql = "select * from users";
//
//            PreparedStatement ps = conn.prepareStatement(sql);
//
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                User u = new User(
//                        rs.getInt("id"),
//                        rs.getString("username"),
//                        rs.getString("password")
//                );
//                users.add(u);
//            }
//            return users;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer id) {

    }
}
