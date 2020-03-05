package com.zipcodewilmington.froilansfarm.Simulation;

import com.zipcodewilmington.froilansfarm.Simulation.Events.*;

public enum WeekDay {

    MON("Monday","Mon", new MondayEvents()),
    TUE("Tuesday","Tue", new TuesdayEvents()),
    WED("Wednesday","Wed", new WednesdayEvents()),
    THU("Thursday","Thr", new ThursdayEvents()),
    FRI("Friday","Fri", new FridayEvents()),
    SAT("Saturday","Sat", new SundayEvents()),
    SUN("Sunday","Sun", new SundayEvents());

    private String weekDayName;
    private String weekDayShortName;
    private Events weekDayEvents;

    private WeekDay(String weekDayName, String weekDayShortName, Events weekDayEvents){
        this.weekDayName = weekDayName;
        this.weekDayShortName = weekDayShortName;
        this.weekDayEvents = weekDayEvents;
    }

    public String getWeekDayName() {
        return weekDayName;
    }

    public String getWeekDayShortName() {
        return weekDayShortName;
    }

    public Events getWeekDayEvents() { return weekDayEvents; }
}
