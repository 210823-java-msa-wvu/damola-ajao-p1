package com.revature.controllers;

import com.revature.models.ReStatus;
import com.revature.repos.hibernate.ReStatusHibernate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BencoController implements FrontController{
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ReStatus taka = new ReStatus();
        ReStatusHibernate tatoba = new ReStatusHibernate();
        //need to get Id
//        taka.setRlink();
        taka.setBenco(request.getParameter("descript"));
        taka.setB_date(request.getParameter("date"));
        taka.setB_approval(Boolean.parseBoolean(request.getParameter("type")));

        tatoba.update(taka);
        response.sendRedirect("static/subcompBENCO.html");

    }
}
