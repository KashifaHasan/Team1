import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by kashifa on 9/16/15.
 */
public class TimeWarnerPayment extends TimeWarnerBase {

    @Test

    public void makeapayment()throws Exception{
        tosignin();
        sleepfor(3);
        clickByCss("#start-pay-bill");
        sleepfor(2);
        clickByCss("#onetime_opt");
        clickByCss("#payment-method");
        sleepfor(4);
        //This is to select an option with text.
       // By.xpath(".//*[@id='payment-method']/option[@value='card']");


        Select selectBox = new Select(driver.findElement(By.id("payment-method")));
        selectBox.selectByVisibleText("card");
        //By.xpath(".//*[@id='payment-method']/option[@value=card']");
        //clickByXpath(".//*[@id='payment-method']/option[text() = 'Credit Card or Debit Card']");
       //clickByXpath(".//*[@id='payment-method']");

        sleepfor(2);
        //driver.findElement(By.cssSelector(""))
        //clickByCss("#onetime_opt");

        //clickByXpath(".//*[@id='confirm-billpay-type']");
        clickByCss("#confirm-billpay-type");
        //clickByCss(".cancel-link.pull-right"); //For the cancel option
        //clickByXpath(".//*[@id='agree-terms-checkbox']"); //Giving some trouble for the clicking
//        clickByCss("#agree-terms");
//        clickByCss(".button");
//        clickByCss(".selected");
//        sleepfor(2);
//        tosignout();


    }
}
