package com.revature.controllers;

import com.revature.models.ReStatusB;
import com.revature.repos.hibernate.ReStatusBHibernate;
import com.revature.repos.hibernate.ReStatusDSHibernate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BencoController implements FrontController{
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ReStatusB taka = new ReStatusB();
        ReStatusBHibernate taja = new ReStatusBHibernate();
        //need to get Id
        taka.setRlink(Integer.parseInt(request.getParameter("statnum")));
        taka.setBenco(request.getParameter("descript"));
        taka.setB_date(request.getParameter("date"));
        taka.setB_approval(Boolean.parseBoolean(request.getParameter("type")));

        taja.update(taka);
        response.sendRedirect("static/subcompBENCO.html");

    }
}
