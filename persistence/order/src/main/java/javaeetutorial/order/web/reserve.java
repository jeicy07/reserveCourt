/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javaeetutorial.order.ejb.RequestBean;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jicl
 */
public class reserve extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB
    private RequestBean requestb;
    
    private class resResp {

        public resResp(boolean status) {
            this.status = status;
        }
        public boolean status;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");		  
	response.addHeader("Access-Control-Allow-Origin","*");	

        try {
            //read data
            String username = request.getParameter("username");
            int courtId = Integer.parseInt(request.getParameter("courtId")); 
            int year = Integer.parseInt(request.getParameter("year"));
            int month = Integer.parseInt(request.getParameter("month"));
            int date = Integer.parseInt(request.getParameter("date"));
            int hour = Integer.parseInt(request.getParameter("hour"));

            
            //connect database
            

            boolean finalStatus = requestb.reserveCourt(courtId, year, month, date, hour, username);

            Gson gson = new Gson();
            reserve.resResp respData = new reserve.resResp(finalStatus);
            String json = gson.toJson(respData); 
            PrintWriter out = response.getWriter();
            out.println(json);
           
        } catch (Exception e){
            System.out.println(e);
        }
            
    }
    
    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
	resp.addHeader("Access-Control-Allow-Origin","*");		
	resp.addHeader("Access-Control-Max-Age","1728000");		
	resp.addHeader("Access-Control-Allow-Methods","GET,POST,OPTIONS"); 
	resp.addHeader("Access-Control-Allow-Headers", "User-Agent,Origin,Cache-Control,Content-type,x-zd,Date,Server,withCredentials");
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
