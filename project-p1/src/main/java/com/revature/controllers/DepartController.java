package com.revature.controllers;

import com.revature.models.ReStatus;
import com.revature.repos.hibernate.ReStatusHibernate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DepartController implements FrontController{
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        ReStatus tora = new ReStatus();
        ReStatusHibernate tatoba = new ReStatusHibernate();
        //need to get Id
        tora.setDepart_head(request.getParameter("descript"));
        tora.setDh_date(request.getParameter("date"));
        tora.setDh_approval(Boolean.parseBoolean(request.getParameter("type")));

        tatoba.update(tora);
        response.sendRedirect("static/subcompDEPART.html");
    }
}
