package com.revature.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.ReStatus;
import com.revature.services.ReStatusServices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReStatusController implements FrontController{

    private ReStatusServices statService = new ReStatusServices();
    private ObjectMapper om = new ObjectMapper();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // Getting the attribute we set in the RequestHandler's handle() method
        String path = (String) request.getAttribute("path");
        System.out.println("Path attribute: " + path);

        if (path == null || path.equals("")) {

            switch (request.getMethod()) {

                case "GET": {
                    System.out.println("Getting all status from the database...");
                    response.getWriter().write(om.writeValueAsString(statService.getAllStats()));
                    break;
                }

                case "POST": {
                    // then we would add the request (read from the request body) to the database
                    ReStatus b = om.readValue(request.getReader(), ReStatus.class);

                    response.getWriter().write(om.writeValueAsString(statService.createBook(b)));
                    break;
                }

            }


        } else {
            // Else -> there IS a path attribute that we need to use in our logic

            // save that attribute into an integer
            int bookId = Integer.parseInt(path);
            ReStatus b = null;

            switch (request.getMethod()) {
                // /books/1
                case "GET": {
                    b = statService.searchById(bookId);
                    if (b != null) {
                        response.getWriter().write(om.writeValueAsString(b));
                    } else {
                        response.sendError(404, "Book not found");
                    }
                    break;
                }

                case "PUT": {
                    b = om.readValue(request.getReader(), ReStatus.class);
                    statService.updateBook(b);
                    break;
                }
                case "DELETE": {
                    statService.deleteBook(bookId);
                    break;
                }

                default: {
                    response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
                    break;
                }

            }
        }




    }
}
