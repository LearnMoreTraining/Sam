package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BaseCode;
import resuable.ReadExcel;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginSteps extends BaseCode {


   @Given("User navigates to url")
    public void navigateUrl(){

       driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
       
   }
   
   @And("User clicks the login button")
    public void clickLoginButton(){
       driver.findElement(By.xpath("//button[text()='Login']")).click();

   }

   @When("User Enters the username {string} and password {string}")
   public void enterCredit(String userName,String password) throws IOException {
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys(ReadExcel.getExcelData("login",0,0));
      // driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")));

       driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ReadExcel.getExcelData("login",1,0));

   }

    @Then("User verfiy whether navigates to EventCalendar Page")
    public void navigateToEventCalander() {
    }



    @Then("User verify the error message {string}")
    public void verfiyErrorMessage(String errorMessage) {

        String actualMessage = driver.findElement(By.id("errorMessage")).getText();

        System.out.println(actualMessage);

      //  String expectedResult = "check your username and password. If you still can't log in, contact your Salesforce administrator.";

        if(actualMessage.equals(errorMessage)){

            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

       String title = driver.getTitle();
        System.out.println(title);



    }

    @Given("user counts the dropdown values")
    public void userCountsTheDropdownValues() {

     WebElement currencyEleemnt = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));

     int currencySize=  currencyEleemnt.findElements(By.tagName("option")).size();
        System.out.println(currencySize);

     Select currency = new Select(currencyEleemnt);
    // currency.selectByIndex(5);
    //    currency.selectByVisibleText("OMR");
        currency.selectByValue("CAD");

        for(int g = 0 ; g < currencySize; g++ ){

         String currencyValue=   currencyEleemnt.findElements(By.tagName("option")).get(g).getText();
            System.out.println(currencyValue);
        }

    }

    @Given("user handles the dynamic dropdown")
    public void userHandlesTheDynamicDropdown() {

    //   driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();

     driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketOrigin1']/following-sibling::div[2]/child::input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();

       driver.findElement(By.xpath("//a[@value='HYD']")).click();

//       WebElement toElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
//
//       toElement.findElement(By.xpath("//a[@value='MAA']")).click();

        driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']/descendant::li/child::a[@value='BLR']")).click();

    }

    @Given("user handles the mouser actions")
    public void userHandlesTheMouserActions() {

       WebElement amaz = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

       Actions a = new Actions(driver);
       a.clickAndHold(amaz).build().perform();

    //   driver.findElement(By.linkText("Baby Wishlist")).click();
       driver.findElement(By.partialLinkText("y Wish")).click();

    }

    @Given("user handles the drag and drop")
    public void userHandlesTheDragAndDrop() {

WebElement frameElemnt = driver.findElement(By.className("demo-frame"));

       driver.switchTo().frame(frameElemnt);

       WebElement drag = driver.findElement(By.id("draggable"));
       WebElement drop = driver.findElement(By.id("droppable"));
       Actions dd = new Actions(driver);
       dd.dragAndDrop(drag,drop).build().perform();
       driver.switchTo().defaultContent();

    }

    @Given("user handles the table")
    public void userHandlesTheTable() {

       WebElement eyTable = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

      int colunOneSize = eyTable.findElements(By.tagName("th")).size();

      List<String> columnValues = new ArrayList<String>();
       for(int k =1 ; k< colunOneSize; k++ ){
          String val= eyTable.findElements(By.tagName("th")).get(k).getText();
           columnValues.add(val);
       }

        System.out.println(columnValues);

        System.out.println(columnValues.get(0));


        WebElement revenuTable = driver.findElement(By.className("wikitable"));

//       int j = revenuTable.findElements(By.xpath("//tr/td[6]")).size();
//
//        for (int i=0; i < j; i++){
//
//         String fy19=   revenuTable.findElements(By.xpath("//tr/td[6]")).get(i).getText();
//            System.out.println(fy19);
//
//        }

        List<WebElement> reElem =revenuTable.findElements(By.xpath("//tr/td[6]"));
        List<String> h = new ArrayList<String>();
        for(WebElement e:reElem){
            h.add(e.getText());
        }

        System.out.println(h);
    }
}
