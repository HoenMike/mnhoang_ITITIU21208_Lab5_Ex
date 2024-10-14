/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.lab5_inclass;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author hoang
 */
@WebServlet(name = "GetInfo", urlPatterns = {"/GetInfo"})
public class GetInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String major = request.getParameter("major");
        String interests = request.getParameter("interests");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Reading Personal Information</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f0f0f0; }");
            out.println("table { border-collapse: collapse; width: 50%; margin: 20px auto; background-color: white; }");
            out.println("th, td { border: 1px solid black; padding: 8px; text-align: left; }");
            out.println("th { background-color: #f2f2f2; font-weight: bold; }");
            out.println("h2 { text-align: center; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Reading Personal Information</h2>");
            out.println("<table>");
            out.println("<tr><th>ID</th><td>" + id + "</td></tr>");
            out.println("<tr><th>Name</th><td>" + name + "</td></tr>");
            out.println("<tr><th>Email</th><td>" + email + "</td></tr>");
            out.println("<tr><th>Gender</th><td>" + gender + "</td></tr>");
            out.println("<tr><th>Major</th><td>" + major + "</td></tr>");
            out.println("<tr><th>Interesting Field</th><td>" + interests + "</td></tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
