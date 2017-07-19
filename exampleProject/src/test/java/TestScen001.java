import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by shawon on 7/19/17.
 */
public class TestScen001 {


    private static final int DEFAULT_IMPLICITY_WAIT_TIME = 30;
    private WebDriver driver;


    @Before
    public void setUp() {

        System.out.println("********* Before ************");
        //https://github.com/bonigarcia/webdrivermanager
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITY_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://developer.mastercard.com/");


    }

    @Test
    public void TestmasterCard1() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.id("homeIntroViewApisLink")).click();
        String x =  driver.findElement(By.cssSelector("section[class='mc-titlecta']")).getText();
        System.out.println(x);
    }

    @Test

    public void TestmasterCard2ForPaymentApiTest() throws InterruptedException {

        WebElement paymentApi = driver.findElement(By.tagName("h6"));
        if (paymentApi.getText().contains("PAYMENTS APIS")){
            paymentApi.click();
            WebElement verifyPaymentApi = driver.findElement(By.xpath(".//*[@id='content']/section/section/section/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[4]"));
            String color = verifyPaymentApi.getCssValue("background-color");
            System.out.println(color);

        }else {
            Thread.sleep(10000);
            WebElement secondAttempToFindpaymentApi = driver.findElement(By.tagName("h6"));
            if (secondAttempToFindpaymentApi.getText().contains("PAYMENTS APIS")) {
                secondAttempToFindpaymentApi.click();
                WebElement verifyPaymentApi = driver.findElement(By.xpath(".//*[@id='content']/section/section/section/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[4]"));
                String color = verifyPaymentApi.getCssValue("background-color");
                System.out.println(color);
            } else {
                Thread.sleep(10000);
                WebElement thirdAttempToFindpaymentApi = driver.findElement(By.tagName("h6"));
                if (thirdAttempToFindpaymentApi.getText().contains("PAYMENTS APIS")) {
                    thirdAttempToFindpaymentApi.click();
                    WebElement verifyPaymentApi = driver.findElement(By.xpath(".//*[@id='content']/section/section/section/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[4]"));
                    String color = verifyPaymentApi.getCssValue("background-color");
                    System.out.println(color);
                } else {
                    Thread.sleep(10000);
                    WebElement finalAttempt = driver.findElement(By.tagName("h6"));
                    if (finalAttempt.getText().contains("PAYMENTS APIS")) {
                        finalAttempt.click();
                        WebElement verifyPaymentApi = driver.findElement(By.xpath(".//*[@id='content']/section/section/section/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[4]"));
                        String color = verifyPaymentApi.getCssValue("background-color");
                        System.out.println(color);
                    } else {
                        System.out.println("Wrong value is selected");
                    }
                }


            }

        }



    }

    @Test

    public void TestmasterCard2ForDataService() throws InterruptedException {

        WebElement dataServiceApi = driver.findElement(By.tagName("h6"));
        if (dataServiceApi.getText().contains("Data Services APIs")){
            dataServiceApi.click();
            WebElement verifyDataServiceApi = driver.findElement(By.xpath(".//*[@id='content']/section/section/section/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[6]"));
            String color = verifyDataServiceApi.getCssValue("background-color");
            System.out.println(color);

        }else {
            Thread.sleep(10000);
            WebElement secondAttemptTodataServiceApi = driver.findElement(By.tagName("h6"));
            if (secondAttemptTodataServiceApi.getText().contains("Data Services APIs")){
                secondAttemptTodataServiceApi.click();
                WebElement verifyDataServiceApi = driver.findElement(By.xpath(".//*[@id='content']/section/section/section/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[6]"));
                String color = verifyDataServiceApi.getCssValue("background-color");
                System.out.println(color);

            } else {
                Thread.sleep(10000);
                WebElement thirdAttempToFindDataServiceApi = driver.findElement(By.tagName("h6"));
                if (thirdAttempToFindDataServiceApi.getText().contains("Data Services APIs")) {
                    thirdAttempToFindDataServiceApi.click();
                    WebElement verifyPaymentApi = driver.findElement(By.xpath(".//*[@id='content']/section/section/section/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[6]"));
                    String color = verifyPaymentApi.getCssValue("background-color");
                    System.out.println(color);
                } else {
                    Thread.sleep(10000);
                    WebElement finalAttemptToFindDataServiceApi = driver.findElement(By.tagName("h6"));
                    if (finalAttemptToFindDataServiceApi.getText().contains("Data Services APIs")) {
                        finalAttemptToFindDataServiceApi.click();
                        WebElement verifyPaymentApi = driver.findElement(By.xpath(".//*[@id='content']/section/section/section/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[6]"));
                        String color = verifyPaymentApi.getCssValue("background-color");
                        System.out.println(color);
                    } else {
                        System.out.println("Wrong value is selected");
                    }
                }


            }

        }
    }

















}
