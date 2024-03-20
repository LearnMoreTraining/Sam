package stepdefination;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode  {

    @Before()
    public void startUp() throws IOException {

        BaseCode.launchBrowser();
    }

    @After()
    public void tearDown(){

    }

    @BeforeStep()
    public void takeSc(){

    }

    @AfterStep()
    public void TakeScreenshot(Scenario sc){

       byte[] byteData = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(byteData,"image/png",sc.getName());
    }
}
