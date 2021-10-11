package com.revature.controllers;

import com.revature.services.UserServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
        String job_title = userServices.UserJob(username);
        System.out.println("Username: " + username + " Password: " + password + " Job Title: " + job_title);

        Cookie cookie = new Cookie("User", username);
        response.addCookie(cookie);

        if (userServices.login(username, password)) {
            switch (job_title) {
                case "Employee":
                    //View all Songs
                    response.sendRedirect("static/employee.html");
                    break;
                case "Direct Supervisor":
                    //View all song platforms
                    response.sendRedirect("static/directsupervisor.html");
                    break;
                case "Department Head":
                    //View Playlist
                    response.sendRedirect("static/departhead.html");
                    break;
                case "Benefits Coordinator":
                    //Make Playlist
                    response.sendRedirect("static/benco.html");
                    break;
                default:
                    System.out.println("System error, please try again");
                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid login credentials");
                    break;
            }
        }
        }

    }

