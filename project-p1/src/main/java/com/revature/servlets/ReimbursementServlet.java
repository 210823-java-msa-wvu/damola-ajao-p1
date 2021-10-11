package com.revature.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementServices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReimbursementServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;


    ObjectMapper om = new ObjectMapper();
    ReimbursementServices reimbursementServicesService = new ReimbursementServices();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        response.getWriter().write(om.writeValueAsString(reimbursementServicesService.getAllRe()));
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String descript = request.getParameter("descript");
        String type = request.getParameter("type");
        String location = request.getParameter("location");
        String cost = request.getParameter("cost");
        String grading = request.getParameter("grading");

        Reimbursement rein = new Reimbursement();
        //rein.setUseridlink(cookie);
        rein.setDate(date);
        rein.setTime(time);
        rein.setDescript(descript);
        rein.setType_of_event(type);
        rein.setLocation(location);
        rein.setCost(cost);
        rein.setGrading_format(grading);

//        response.getWriter().write(om.writeValueAsString(a));
    }
}
