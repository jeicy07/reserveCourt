/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class queryByTime extends HttpServlet {

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
    private RequestBean requestBean;

    private class queryByTimeResp {
       
        
        public queryByTimeResp(List<Integer> availableCourtIds) {
            this.availableCourtIds = availableCourtIds;
        }
        public List<Integer> availableCourtIds;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");		  
	response.addHeader("Access-Control-Allow-Origin","*");	
        int year = Integer.parseInt(request.getParameter("year"));
        int month = Integer.parseInt(request.getParameter("month"));
        int date = Integer.parseInt(request.getParameter("date"));
        int startHour = Integer.parseInt(request.getParameter("startHour"));
        
        Gson gson = new Gson();
        // return Data
        List<Integer> finalAvailableCourtIds = requestBean.queryByTime(year, month, date, startHour);
        queryByTime.queryByTimeResp respData = new queryByTime.queryByTimeResp(finalAvailableCourtIds);
        String json=gson.toJson(respData);        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println(json);
            //out.println(password);
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
