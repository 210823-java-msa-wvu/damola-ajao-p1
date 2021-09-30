package com.revature.controllers;

import com.revature.services.UserServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController implements FrontController {

    private Logger log = LogManager.getLogger(LoginController.class);
    private UserServices userServices = new UserServices();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("Username: " + username + " Password: " + password);
        if (userServices.login(username, password)) {
            response.sendRedirect("static/books.html");
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid login credentials");
        }


    }
}
