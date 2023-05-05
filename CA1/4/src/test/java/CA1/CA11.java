package CA1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CA11 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.amazon.in/Samsung-Galaxy-Ultra-Cream-Storage/dp/B0BRSLH4B5/ref=sr_1_5?keywords=samsung%2Bs23%2Bultra%2B5g&qid=1683193039&sprefix=samsung%2Caps%2C332&sr=8-5&th=1");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String etitle = "Samsung Galaxy S23 Ultra 5G (Cream, 12GB, 256GB Storage) : Amazon.in: Electronics";
        System.out.println(title);
        if(title.equals(etitle)) {
        	System.out.println("Title is matching");
        }
        else {
        	System.out.println("Title Mismatch");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 

        System.out.println("Is item added to cart: +present");
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(2000);
        String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String extext = "Your Amazon Cart is empty.";
        if(removeText.equals(extext)) {
        	System.out.println("Product is removed");
        }
        driver.get("https://www.amazon.in/Samsung-Galaxy-Ultra-Cream-Storage/dp/B0BRSLH4B5/ref=sr_1_5?keywords=samsung%2Bs23%2Bultra%2B5g&qid=1683193039&sprefix=samsung%2Caps%2C332&sr=8-5&th=1");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        System.out.println("Quantity is changed.");
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
        Thread.sleep(1000);
        String sign = driver.getTitle();
        System.out.println(sign);
        String esign = "Amazon Sign In";
        if(sign.equals(esign)) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Failure");
        }
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kavinadityatr@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Pendoor6/");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }
}

