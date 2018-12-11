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
    private int courtId;
    private Calendar startDate;
    private List<Integer> startHour;
    
    public Available(int court_id, Calendar start_date, List<Integer> start_hour){
        this.courtId = court_id;
        this.startDate = start_date;
        this.startHour = start_hour;
    }

    public int getCourt_id() {
        return courtId;
    }

    public Calendar getStart_date() {
        return startDate;
    }

    public List<Integer> getStart_hour() {
        return startHour;
    }

    public void setCourt_id(int court_id) {
        this.courtId = court_id;
    }

    public void setStart_date(Calendar start_date) {
        this.startDate = start_date;
    }

    public void setStart_hour(List<Integer> start_hour) {
        this.startHour = start_hour;
    }
    
}
