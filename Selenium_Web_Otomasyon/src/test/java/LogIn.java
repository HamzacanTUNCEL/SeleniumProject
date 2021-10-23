import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;


public class LogIn extends BaseTest {

    @Test
    public void A() // Accept cookies.
    {
        page_lcw.Cookies();
    }

    @Test
    public void B() //First method for checking if the page is open
    {
        if (driver.getCurrentUrl().contains("https://www.lcwaikiki.com/"))
        {
            System.out.println("The LCW page is successfully opened.");
        }
        else
        {
            throw new WebDriverException("Page is unreachable");
        }
    }

    @Test
    public void C() // Second method for checking if the page is open
    {
        String Get_Title_of_Page = driver.getTitle();
        String Title_of_Page = "Online Alışveriş Sitesi, Moda Senin Seçimin - LC Waikiki";
        String Title_of_Page_1 = "LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki";
        String Title_of_Page_2 = "LC Waikiki - Online Alışveriş Sitesi, Moda Senin Seçimin - LC Waikiki";

        if (Get_Title_of_Page.equalsIgnoreCase(Title_of_Page))
        {
            System.out.println("Page name is"+Get_Title_of_Page+".");
            System.out.println("Page is open.");
        }
        else if(Get_Title_of_Page.equalsIgnoreCase(Title_of_Page_1)){
            System.out.println("Page name is "+Get_Title_of_Page+".");
            System.out.println("Page is open.");
        }
        else if(Get_Title_of_Page.equalsIgnoreCase(Title_of_Page_2)){
            System.out.println("Page name is"+Get_Title_of_Page+".");
            System.out.println("Page is open.");
        }
        else
        {
            System.out.println("Page name is"+Get_Title_of_Page+".");
            System.out.println("Couldn't reach to the page.");
        }
    }

    @Test
    public void D()  // The login button pressed which is on the left in the main page screen
    {
        System.out.println("Opening the Login Section.");
        page_lcw.PressLoginButton();
    }

    @Test
    public void E() // Writing email to the e-mail section.
    {
        System.out.println("Writing Email");
        page_lcw.setID("asdasd@gmail.com");// The User E-mail

    }

    @Test
    public void F() // Writing password to the password section.
    {
        System.out.println("Writing Password");
        page_lcw.setPassword("asdasd"); // The User password
    }

    @Test
    public void G() //Login button is pressed
    {
        System.out.println("Login Button Pressed");
        page_lcw.PressLogin();
    }

    @Test
    public void H() //Cheacking if the login is successful
    {
        if (driver.getPageSource().contains("Hesabım")) {
            System.out.println("Login is successful.");
            System.out.println("-----------------------------");
        }
        else
        {
            System.out.println("Login is failed.");
            System.out.println("-----------------------------");
        }
    }

    @Test
    public void I()// Search Bar Click and Write the product name.
    {
        page_lcw.Search_Input("Pantalon");
    }

    @Test
    public void J() //Search Box Click
    {
        page_lcw.Search_Box();
    }

    @Test
    public void K()  //Scroll Down the Page
    {
        System.setProperty("webdriver.gecko.driver", "D://Selenium    Environment//Drivers//geckodriver.exe");
     //   WebDriver driver = new ChromeDriver();
     //   driver.navigate().to("https://www.lcwaikiki.com/tr-TR/TR/arama?q=pantolon");

        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @Test
    public void L() //Show more page
    {
        page_lcw.Show_More_Page();
    }

    List<WebElement> AllProducts;
    @Test
    public void M() //Selecting a random product.
    {
        try
        {
            AllProducts  = driver.findElements(By.xpath("//div[@class='picture-box']"));
            Thread.sleep(1000);
            Random random = new Random();
            int RandomProduct  = random.nextInt(AllProducts.size());
            AllProducts.get(RandomProduct).click();
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }

    List<WebElement> SizesOfProducts;
    @Test
    public void N() //Selecting a random product size.
    {
        try
        {
            SizesOfProducts  = driver.findElements(By.xpath("//div[@class='col-xs-12 size-area main-size-area pt-5']"));
            Thread.sleep(1000);
            Random random = new Random();
            int RandomSizeOfProducts  = random.nextInt(SizesOfProducts.size());
            SizesOfProducts.get(RandomSizeOfProducts).click();
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }

    @Test
    public void O() throws InterruptedException //Adding the product to the cart.
    {
        page_lcw.Add_To_Cart();
    }

    @Test
    public void P() throws InterruptedException //Opening my basket section.
    {
        page_lcw.My_Basket();
    }

    @Test
    public void R() throws InterruptedException // Increasing the product number in my bucket.
    {
        page_lcw.Increasing_Product();
    }

    @Test
    public void S() throws InterruptedException // Deleting the product from my bucket.
    {
        driver.findElement(By.xpath("//a[@class='cart-square-link']")).click();
        driver.findElement(By.id("Cart_ProductFavAndDelete_689110317"));
    }
}








