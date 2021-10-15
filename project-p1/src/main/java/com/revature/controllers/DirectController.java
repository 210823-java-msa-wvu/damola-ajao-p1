package com.revature.controllers;

import com.revature.models.ReStatusDS;
import com.revature.repos.hibernate.ReStatusDSHibernate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DirectController implements FrontController{
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ReStatusDS bata = new ReStatusDS();
        ReStatusDSHibernate batakiri = new ReStatusDSHibernate();
        bata.setRlink(Integer.parseInt(request.getParameter("statnum")));
        bata.setDirect_supervisor(request.getParameter("descript"));
        bata.setDs_date(request.getParameter("date"));
        bata.setDs_approval(Boolean.parseBoolean(request.getParameter("type")));

        batakiri.update(bata);
        response.sendRedirect("static/subcompDIRECT.html");
    }
}
