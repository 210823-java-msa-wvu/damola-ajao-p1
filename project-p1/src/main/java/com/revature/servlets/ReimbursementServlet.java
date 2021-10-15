package com.revature.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReimbursementServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;


//    ObjectMapper om = new ObjectMapper();
//    ReimbursementServices reimbursementServicesService = new ReimbursementServices();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



//        response.getWriter().write(om.writeValueAsString(reimbursementServicesService.getAllRe()));
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        super.doPost(request, response);

//        Cookie[] cookie = request.getCookies();
//        Reimbursement rein = new Reimbursement();
//        //rein.setUseridlink(cookie);
//        rein.setDate(request.getParameter("date"));
//        rein.setTime(request.getParameter("time"));
//        rein.setDescript(request.getParameter("descript"));
//        rein.setType_of_event(request.getParameter("type"));
//        rein.setLocation(request.getParameter("location"));
//        rein.setCost(Double.parseDouble(request.getParameter("cost")));
//        rein.setGrading_format(request.getParameter("grading"));






//        ReinbursementHibernate saga = new ReinbursementHibernate();
////        for()
////        rein.setUseridlink(barter[0].getValue);
//        rein.setDate(request.getParameter("date"));
//        rein.setTime(request.getParameter("time"));
//        rein.setDescript(request.getParameter("descript"));
//        rein.setType_of_event(request.getParameter("type"));
//        rein.setLocation(request.getParameter("location"));
//        rein.setCost(Double.parseDouble(request.getParameter("cost")));
//        rein.setGrading_format(request.getParameter("grading"));
//
//        saga.add(rein);
        //        String date = request.getParameter("date");
//        String time = request.getParameter("time");
//        String descript = request.getParameter("descript");
//        String type = request.getParameter("type");
//        String location = request.getParameter("location");
//        String cost = request.getParameter("cost");
//        String grading = request.getParameter("grading");
//
    }
}
