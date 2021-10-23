import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {


    protected WebDriver driver;

    Page_LCW page_lcw;


    @BeforeAll
    public void setUp(){
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.lcwaikiki.com/tr-TR/TR");
    System.out.println("Test is started.");
    page_lcw = new Page_LCW(driver);

    }

//@AfterEach
//    public void setDriver(){
//
//        driver.close();
//
//}


  @AfterAll
  public void Terminate(){
  driver.quit();
  System.out.println("Test is finished.");
  }

}
