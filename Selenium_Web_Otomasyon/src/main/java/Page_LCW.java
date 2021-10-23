import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Page_LCW {

    private WebDriver driver;

    private final By EmailID           = By.id("LoginEmail");
    private final By PasswordID        = By.id("Password");
    private final By LoginID           = By.id("loginLink");
    private final By SearchInput       = By.id("search_input");
    private final By LoginButton       = By.className("dropdown-toggle");
    private final By showmore          = By.className("lazy-load-text");
    private final By Cookie            = By.xpath("//button[text()='Anladım']");
    private final By SearchBox         = By.xpath("//button[@type='button']");
    private final By ShowMorePage      = By.xpath("//p[@class='lazy-load-text']");
    private final By AddToCart         = By.xpath("//a[@class='add-to-cart button-link add-to-cart-button']");
    private final By MyBasket          = By.xpath("//*[text()='Sepetim']");
    private final By IncreasingProduct = By.xpath("//a[@class='oq-up plus']");

    public Page_LCW(WebDriver driver){
        this.driver=driver;
    }

    public void Cookies()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( Cookie );
        IDspace.click();
    }
    public void Increasing_Product()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( IncreasingProduct );
        IDspace.click();
    }
    public void Add_To_Cart()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( AddToCart );
        IDspace.click();
    }
    public void My_Basket()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( MyBasket );
        IDspace.click();
    }
    public void Search_Input(String INPUT)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( SearchInput );
        IDspace.clear();
        IDspace.sendKeys(INPUT);
    }
    public void Show_More_Page()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( ShowMorePage );
        IDspace.click();
    }
    public void Search_Box()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( SearchBox );
        IDspace.click();
    }
    public void setID(String ID)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( EmailID );
        IDspace.click();
        IDspace.sendKeys(ID);
    }
    public void setPassword(String Password)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( PasswordID );
        IDspace.click();
        IDspace.sendKeys(Password);
    }
    public void PressLogin()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( LoginID );
        IDspace.click();
    }
    public void PressLoginButton()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( LoginButton );
        IDspace.click();
    }
    public WebElement find (By locator)
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(locator);
    }
    public void Show_more()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement IDspace = driver.findElement( showmore );
        IDspace.click();
    }
}
