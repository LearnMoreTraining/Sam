package pageobjects;

import resuable.BaseCode;

public class ResultsPage extends BaseCode {

    public static String getPageTitle() throws InterruptedException {
        System.out.println(driver.getTitle());
      return  driver.getTitle();
    }
}
