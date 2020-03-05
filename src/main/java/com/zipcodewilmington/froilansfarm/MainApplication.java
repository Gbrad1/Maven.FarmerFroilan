package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Simulation.Simulation;
import com.zipcodewilmington.froilansfarm.Storage.Farm;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Farm froilansFarm = Simulation.setUpScenario();
        Simulation.simulate(froilansFarm);

    }
}
