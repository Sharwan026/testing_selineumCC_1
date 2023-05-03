package Sharvan.testing_selineum_CC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Q1
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
        String url="https://www.saucedemo.com/";
        driver.get(url); 
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("")).sendKeys("Hello");
//	    driver.findElement(By.xpath("")).sendKeys("7000");
	    driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
//	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("standard");
	    driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("_user");
	    driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("613004");
	    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
    }
}