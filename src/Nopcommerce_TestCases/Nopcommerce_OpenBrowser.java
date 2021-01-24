package Nopcommerce_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Nopcommerce_pages.Nopcommerce_Home;

public class Nopcommerce_OpenBrowser {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Launch_Browser();
		Register();
		first_name();

		//Close_Driver();

	}

	public static void Launch_Browser() {

		String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com");

		// driver.findElement(By.partialLinkText("Eng")).click();
	}

	public static void Register() throws Exception {
		Nopcommerce_Home home = new Nopcommerce_Home();
		home.Register_Btn(driver).click();
		Thread.sleep(3000);
	}

	public static void first_name() throws Exception {
		Nopcommerce_Home home = new Nopcommerce_Home();

		home.Gender(driver).click();

		home.first_name(driver).click();
		home.first_name(driver).sendKeys("Haitham");
		System.out.println("home");
		Thread.sleep(3000);
		home.Last_name(driver).click();
		home.Last_name(driver).sendKeys("Tamer");
		System.out.println("home");

		home.Date_of_birth(driver).click();
		home.Date_of_birth(driver).sendKeys("10");
		home.Date_of_birth(driver).click();

		home.Date_of_birth_m(driver).click();
		home.Date_of_birth_m(driver).sendKeys("September");
		home.Date_of_birth_m(driver).click();

		home.Date_of_birth_y(driver).click();
		home.Date_of_birth_y(driver).sendKeys("1982");
		home.Date_of_birth_y(driver).click();

		Thread.sleep(3000);
		home.Email(driver).click();
		home.Email(driver).sendKeys("Haitham510@gmail.com");
		home.Email(driver).click();

		Thread.sleep(3000);
		home.Company_name(driver).click();
		home.Company_name(driver).sendKeys("AutoSoft");
		home.Company_name(driver).click();

		Thread.sleep(1000);
		home.Password(driver).click();
		home.Password(driver).sendKeys("Haitham1982$");
		home.Password(driver).click();

		Thread.sleep(1000);
		home.Confirm_password(driver).click();
		home.Confirm_password(driver).sendKeys("Haitham1982$");
		home.Confirm_password(driver).click();

		Thread.sleep(1000);
		home.Done(driver).click();

		Thread.sleep(2000);
		home.Continue(driver).click();
		
		
		Thread.sleep(2000);
		home.Logout(driver).click();
		
		
		Thread.sleep(2000);
		home.Login(driver).click();
		
		Thread.sleep(3000);
		home.EnterEmail(driver).click();
		home.EnterEmail(driver).sendKeys("Haitham510@gmail.com");
		home.EnterEmail(driver).click();
		
		home.Entpassword(driver).click();
		home.Entpassword(driver).sendKeys("Haitham1982$");
		home.Entpassword(driver).click();
		
		Thread.sleep(2000);
		home.LoginBtn(driver).click();
		
	}

	public static void Close_Driver() {
		driver.quit();

	}

}
