package ua.ithillel.automation.ui;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;
public class homework {
    private WebDriver driver;

    @BeforeClass
    public static void setUpDriver() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void qAutoEnd2End() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        Thread.sleep(500);
        driver.findElement(By.id("signupName")).sendKeys("Test");
        driver.findElement(By.id("signupLastName")).sendKeys("Test");
        driver.findElement(By.id("signupEmail")).sendKeys("Test221@gmail.com");
        driver.findElement(By.id("signupPassword")).sendKeys("Test12345");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Test12345");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".sidebar_btn-group .sidebar_btn")).click();
        WebElement profilename = driver.findElement(By.cssSelector(".profile_name"));
        Assert.assertEquals("Incorrect button name ", "Test Test", profilename.getText());
        driver.findElement(By.cssSelector(".sidebar_btn")).click();
        driver.findElement(By.cssSelector(".btn-primary")).click();
        driver.findElement(By.id("addCarBrand")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select  option:nth-child(4)")).click();
        driver.findElement(By.id("addCarMileage")).sendKeys("1");
        driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-add-car-modal > div.modal-footer.d-flex.justify-content-end > button.btn.btn-primary")).click();
        driver.findElement(By.cssSelector("body > app-root > app-global-layout > div > div > div > app-panel-layout > div > div > div > div.col-lg-9.main-wrapper > div > app-garage > div > div.panel-page_content > div > ul > li > app-car > div > div.car-heading.d-flex.flex-column.flex-sm-row.justify-content-sm-between > div.car_actions > button.car_add-expense.btn.btn-success")).click();
        driver.findElement(By.id("addExpenseLiters")).sendKeys("12");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("24");
        driver.findElement(By.id("addExpenseMileage")).sendKeys("3");
        driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-add-expense-modal > div.modal-footer.d-flex.justify-content-end > button.btn.btn-primary")).click();
        driver.findElement(By.cssSelector("body > app-root > app-global-layout > div > div > div > app-panel-layout > div > div > div > div.col-3.d-none.d-lg-block.sidebar-wrapper > nav > div > a:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > app-root > app-global-layout > div > div > div > app-panel-layout > div > div > div > div.col-lg-9.main-wrapper > div > app-settings > div > div.panel-page_content > div > div.user-settings_item.-form.-remove-account > div > button")).click();
        driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-remove-account-modal > div.modal-footer.d-flex.justify-content-end > button.btn.btn-danger")).click();
        Thread.sleep(1000);
    }

    @After
    public void postCondition() {
        driver.quit();
    }
}