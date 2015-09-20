import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by kashifa on 9/16/15.
 */
public class SendAnEmail extends SignInandSignOut {

    @Test
    
    public void tosendemail()throws Exception{
//        typeByCss("#idDiv_PWD_UsernameExample", "kashifa.hasan@outlook.com");
//        sleepfor(3);
//        typeByXpathThenEnter(".//*[@id='idDiv_PWD_PasswordExample']", "maliha1220");
//        clickByCss("#idSIButton9");

        driver.findElement(By.cssSelector("#idDiv_PWD_UsernameExample")).click();
    }
}
