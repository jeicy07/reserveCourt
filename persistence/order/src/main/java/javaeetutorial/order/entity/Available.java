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
    private int year;
    private int month;
    private int date;
    private List<Integer> startHour;
    
    public Available(int courtId, int year, int month, int date, List<Integer> startHour){
        this.courtId = courtId;
        this.year = year;
        this.month = month;
        this.date = date;
        this.startHour = startHour;
    }

    public int getCourtId() {
        return courtId;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public List<Integer> getStartHour() {
        return startHour;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setStartHour(List<Integer> startHour) {
        this.startHour = startHour;
    }

    
    
}
