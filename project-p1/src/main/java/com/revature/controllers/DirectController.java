package com.revature.controllers;

import com.revature.models.ReStatus;
import com.revature.repos.hibernate.ReStatusHibernate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DirectController implements FrontController{
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ReStatus bata = new ReStatus();
        ReStatusHibernate tatoba = new ReStatusHibernate();
        //need to get Id
        bata.setDirect_supervisor(request.getParameter("descript"));
        bata.setDs_date(request.getParameter("date"));
        bata.setDs_approval(Boolean.parseBoolean(request.getParameter("type")));

        tatoba.update(bata);
        response.sendRedirect("static/subcompDIRECT.html");
    }
}
