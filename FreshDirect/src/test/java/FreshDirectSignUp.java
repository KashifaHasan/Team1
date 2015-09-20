import CommonApi.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by kashifa on 9/12/15.
 */
public class FreshDirectSignUp extends FreshDirectBase {

    @Test

    public void fdsignup() throws Exception{

    /*    String winHandleBefore = driver.getWindowHandle();
        clickByXpath(".//*[@id='locationbar']/span[3]/button[1]");
        sleepfor(3);
        for(String winHandle: driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        getElementByXpath(".//*[@id='first_name']", "PeopleNTech");
        sleepfor(3);

        driver.close();
        driver.switchTo().window(winHandleBefore);
    */

        String winHandleBefore = driver.getWindowHandle();
        clickByXpath(".//*[@id='locationbar']/span[3]/button[1]");
        //driver.switchTo().frame(driver.findElement(By.cssSelector("html/body/center/div[1]']")));
        iframeHandle(0);
        typeByXpath(".//*[@id='first_name']", "PeopleNTech");
        typeByCss("#last_name", "PNT");
        clearandtypeByCss("#zipcode", "11377");
        clickByXpath(".//*[@id='litesignup']/table/tbody/tr[6]/td/table/tbody/tr/td[2]/span/input[1]");

        typeByCss("#email", userEmailAddress);
        typeByCss("#confirm_email", userEmailAddress);

        typeByCss("#password1", "Test12345");
        typeByCss("#secret_answer", "newyork");
        clickByXpath(".//*[@id='litesignup']/table/tbody/tr[21]/td/a/img");
        sleepfor(5);
        clickByCss(".logoutButton");

//        driver.close();
//        driver.switchTo().frame(1);
//        getElementByCss("#noService_email_notServiceable", "pntseleniumtest@gmail.com");
//        clickByXpath(".//*[@id='noServiceForm']/div[1]/div/table/tbody/tr/td/div/table/tbody/tr/td[1]/input");



    }
}
