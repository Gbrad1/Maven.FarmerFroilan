package com.zipcodewilmington.froilansfarm.Simulation;

import com.zipcodewilmington.froilansfarm.Simulation.Events.Events;
import com.zipcodewilmington.froilansfarm.Simulation.Events.MondayEvents;
import org.junit.Assert;
import org.junit.Test;

public class WeekDayTest {
    @Test
    public void getWeekDayNameTest(){
        WeekDay d1 = WeekDay.WED;
        String actual = d1.getWeekDayName();
        String expected = "Wednesday";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeekDayShortNameTest(){
        WeekDay d1 = WeekDay.FRI;
        String actual = d1.getWeekDayShortName();
        String expected = "Fri";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeekDayEventTest(){
        WeekDay d1 = WeekDay.MON;
        Assert.assertTrue(d1.getWeekDayEvents() instanceof MondayEvents);
    }

}
