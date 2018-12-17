package javaeetutorial.order.web;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Calendar;
import javaeetutorial.order.ejb.RequestBean;
import javaeetutorial.order.entity.Available;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;


/**
 *
 * @author jeicy
 */

public class queryByCategoryAndTime extends HttpServlet {

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
    
    private class queryCateAndTimeReq {

        public queryCateAndTimeReq(Calendar startDate, int startHour, int category) {
            this.startDate = startDate;
            this.startHour = startHour;
            this.category = category;
        }
        public int startHour;
        public Calendar startDate;
        public int category;
        
    }
    
    private class queryCateAndTimeResp {

        public queryCateAndTimeResp(List<Integer> results) {
            this.results = results;
        }
        public List<Integer> results;
    }
    
    private String readJSONData(HttpServletRequest request) {
        StringBuffer json = new StringBuffer();
        String lineString = null;
        try {
            BufferedReader reader = request.getReader();
            while ((lineString = reader.readLine()) != null) {
                json.append(lineString);                
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return json.toString();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");		  
	response.addHeader("Access-Control-Allow-Origin","*");	
        String json = readJSONData(request);
        Gson gson = new Gson();
        queryCateAndTimeReq reqData = gson.fromJson(json, queryCateAndTimeReq.class);
        List<Integer> finalResults = requestBean.queryByTimeAndCategory(reqData.startDate,
                                                reqData.startHour, reqData.category);
        
        // return Data
        queryCateAndTimeResp respData = new queryCateAndTimeResp(finalResults);
        json=gson.toJson(respData);        
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
