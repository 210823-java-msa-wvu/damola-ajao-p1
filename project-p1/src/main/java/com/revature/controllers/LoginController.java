package com.revature.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.repos.hibernate.ReinbursementHibernate;
import com.revature.repos.hibernate.UserHibernate;
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
    private ObjectMapper om = new ObjectMapper();
    private UserHibernate uh = new UserHibernate();
    private ReinbursementHibernate ar = new ReinbursementHibernate();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String job_title = userServices.UserJob(username);
        Integer empId = userServices.UserId(username);
        String firstname = userServices.UserFname(username);
        String lastname = userServices.UserLname(username);
        System.out.println("Username: " + username + " Password: " + password + " Job Title: " + job_title);

        Cookie userId = new Cookie("UserId", String.valueOf(empId));
        Cookie fname = new Cookie("Fname", firstname);
        Cookie lname = new Cookie("Lname", lastname);
        Cookie rlink = new Cookie("link", String.valueOf(empId));

        log.trace("COOKIE TIIIIIMEE");
        response.addCookie(userId);
        response.addCookie(fname);
        response.addCookie(lname);
        response.addCookie(rlink);

        if (userServices.login(username, password)) {
            switch (job_title) {
                case "Employee":
                    //Employee Case
                    log.info("Employer Power");
                    response.sendRedirect("static/employee.html");
                    break;
                case "Direct Supervisor":
                    //Direct S Case
                    log.info("Direct Power");
                    response.sendRedirect("static/directsupervisor.html");
                    break;
                case "Department Head":
                    //Depart H Case
                    log.info("Departo Power");
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
        } else if (!userServices.login(username,password)){
            response.setStatus(403);
            response.getWriter().write("You have the wrong info.");
            response.sendRedirect("static/404.html");
        }
        }

    }

