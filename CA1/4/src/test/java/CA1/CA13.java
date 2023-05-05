package CA1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CA13 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.in/");
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		actions.moveToElement(element).perform();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span"));
		link.click();
		Thread.sleep(3000);
		WebElement yourorder=driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div"));
		yourorder.click();
		Thread.sleep(3000);
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		searchbox.sendKeys("kishorekishore1241@gmail.com");
		WebElement yesbutton=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		yesbutton.click();
		Thread.sleep(3000);
		WebElement passw=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		passw.sendKeys("Kishore@2004");
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
		signin.click();
		
	}
}