package Nopcommerce_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Nopcommerce_Home {

	public WebElement Gender(WebDriver driver) {
		return driver.findElement(By.id("gender-male"));

	}
	
	
	public WebElement Register_Btn(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]"));

	}

	public WebElement first_name(WebDriver driver) {
		return driver.findElement(By.id("FirstName"));

	}

	public WebElement Last_name(WebDriver driver) {
		return driver.findElement(By.id("LastName"));

	}

	public WebElement Date_of_birth(WebDriver driver) {
		return driver.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));

	}

	public WebElement Date_of_birth_m(WebDriver driver) {
		return driver.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));

	}

	public WebElement Date_of_birth_y(WebDriver driver) {
		return driver.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));

	}

	public WebElement Email(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/input"));

	}

	public WebElement Company_name(WebDriver driver) {
		return driver.findElement(By.id("Company"));

	}

	public WebElement Password(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[1]/input"));

	}

	public WebElement Confirm_password(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[2]/input"));

	}

	public WebElement Done(WebDriver driver) {
		return driver.findElement(By.id("register-button"));

	}

	
	public WebElement Continue(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[2]/input"));

	}
	
	public WebElement Logout(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));

	}
	public WebElement Login(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));

	}
	
	public WebElement EnterEmail(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[1]/input"));

	}
	public WebElement Entpassword(WebDriver driver) {
		return driver.findElement(By.id("Password"));
		
	}	

		public WebElement LoginBtn(WebDriver driver) {
			return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input"));	
		
	}
}
