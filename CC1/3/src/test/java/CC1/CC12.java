package CC1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC12
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.saucedemo.com/");
		driver.manage().window().maximize() ;
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		txtBoxl.sendKeys("standard_user");
		WebElement txtBox2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		txtBox2.sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String A=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("A-Z : "+A);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
		String Z=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println("Z-A : "+Z);
		System.out.println("Product Filter worked successfully");
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		String low=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		System.out.println("Low Price : "+low);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		String high=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		System.out.println("High Price : "+high);
		System.out.println("Price Filter worked successfully");
	}
}