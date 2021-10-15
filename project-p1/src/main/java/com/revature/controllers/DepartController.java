package com.revature.controllers;

import com.revature.models.ReStatusDH;
import com.revature.repos.hibernate.ReStatusDHHibernate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DepartController implements FrontController{
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        ReStatusDH tora = new ReStatusDH();
        ReStatusDHHibernate tatoba = new ReStatusDHHibernate();
        tora.setRlink(Integer.parseInt(request.getParameter("statnum")));
        tora.setDepart_head(request.getParameter("descript"));
        tora.setDh_date(request.getParameter("date"));
        tora.setDh_approval(Boolean.parseBoolean(request.getParameter("type")));

        tatoba.update(tora);
        response.sendRedirect("static/subcompDEPART.html");
    }
}
