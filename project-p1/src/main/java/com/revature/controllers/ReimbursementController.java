package com.revature.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.ReStatusB;
import com.revature.models.ReStatusDH;
import com.revature.models.ReStatusDS;
import com.revature.models.Reimbursement;
import com.revature.repos.hibernate.ReStatusBHibernate;
import com.revature.repos.hibernate.ReStatusDHHibernate;
import com.revature.repos.hibernate.ReStatusDSHibernate;
import com.revature.repos.hibernate.ReinbursementHibernate;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReimbursementController implements FrontController{

    ObjectMapper om = new ObjectMapper();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
        Cookie[] cookies = request.getCookies();
        Integer emp;

        Reimbursement rein = new Reimbursement();
        ReStatusDS open = new ReStatusDS();
        ReStatusB beat = new ReStatusB();
        ReStatusDH saber = new ReStatusDH();

        ReStatusDSHibernate alpha = new ReStatusDSHibernate();
        ReStatusBHibernate beta = new ReStatusBHibernate();
        ReStatusDHHibernate omega = new ReStatusDHHibernate();
        ReinbursementHibernate saga = new ReinbursementHibernate();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("UserId")) {
                    //do something
                    emp = Integer.parseInt(cookie.getValue());
                    rein.setUseridlink(emp);
                    //value can be retrieved using #cookie.getValue()
                }
            }
        }

        rein.setDate(request.getParameter("date"));
        rein.setTime(request.getParameter("time"));
        rein.setDescript(request.getParameter("descript"));
        rein.setType_of_event(request.getParameter("type"));
        rein.setLocation(request.getParameter("location"));
        rein.setCost(Double.parseDouble(request.getParameter("cost")));
        rein.setGrading_format(request.getParameter("grading"));
        rein.setGrade(request.getParameter("grade"));

        saga.add(rein);

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("UserId")) {
                    //do something
                    emp = Integer.parseInt(cookie.getValue());
                    beat.setRlink(emp);
                    //value can be retrieved using #cookie.getValue()
                }
            }
        }
        beat.setB_approval(false);
        beat.setB_date("01-01-2021");
        beat.setBenco("Entry Open");
        beta.add(beat);

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("UserId")) {
                    //do something
                    emp = Integer.parseInt(cookie.getValue());
                    saber.setRlink(emp);
                    //value can be retrieved using #cookie.getValue()
                }
            }
        }
        saber.setDh_approval(false);
        saber.setDh_date("01-01-2021");
        saber.setDepart_head("Entry Open");
        omega.add(saber);

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("UserId")) {
                    //do something
                    emp = Integer.parseInt(cookie.getValue());
                    open.setRlink(emp);
                    //value can be retrieved using #cookie.getValue()
                }
            }
        }
        open.setDs_approval(false);
        open.setDs_date("01-01-2021");
        open.setDirect_supervisor("Entry Open");
        alpha.add(open);




        response.sendRedirect("static/submissioncomplete.html");

    }

        }







