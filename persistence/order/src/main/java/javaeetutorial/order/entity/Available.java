/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.entity;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author jicl
 */
public class Available {
    private int court_id;
    private Calendar start_date;
    private List<Integer> start_hour;
    
    public Available(int court_id, Calendar start_date, List<Integer> start_hour){
        this.court_id = court_id;
        this.start_date = start_date;
        this.start_hour = start_hour;
    }

    public int getCourt_id() {
        return court_id;
    }

    public Calendar getStart_date() {
        return start_date;
    }

    public List<Integer> getStart_hour() {
        return start_hour;
    }

    public void setCourt_id(int court_id) {
        this.court_id = court_id;
    }

    public void setStart_date(Calendar start_date) {
        this.start_date = start_date;
    }

    public void setStart_hour(List<Integer> start_hour) {
        this.start_hour = start_hour;
    }
    
}
