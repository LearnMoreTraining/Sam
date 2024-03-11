package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resuable.BaseCode;

import java.io.IOException;

public class Hooks  {


    @Before()
    public void startUp() throws IOException {

        BaseCode.launchBrowser();
    }

    @After()
    public void tearDown(){

    }
}
