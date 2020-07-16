package com.cybertek.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before(order = 2)
    public void setUpScenario() {
        System.out.println("------> Before annotation: Setting up browser");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabaseConnection() {
        System.out.println("------> Before annotation: DB CONNECTION CREATED <------");

    }
    @After(order = 1)
    public void tearDownScenario() {
        System.out.println("------> After annotation: Closing up browser");

    }
    @After(value = "@db",order = 2)
    public void tearDownDateBaseConnection(){
        System.out.println("------> After annotation: DB CONNECTION CLOSED <------");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("===========> BEFORESTEP: TAKING SCREENSHOT <===========");

    }
    @AfterStep
    public void tearDownStep(){
        System.out.println("===========> AFTERSTEP: TAKING SCREENSHOT <===========");

    }


}
