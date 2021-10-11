package com.revature.servlets;


import com.revature.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends FrontControllerServlet {

    User setUser = new User();




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        User setUser = new User();
//        Cookie cookie = new Cookie("User",setUser.getUsername());
//        response.addCookie(cookie);
    }


}
