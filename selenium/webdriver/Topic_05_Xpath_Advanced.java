package webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_05_Xpath_Advanced {
	
	// Khai báo biến đại diện cho Selenium WebDriver
	WebDriver driver;
	
	// precondition
	@BeforeClass
	public void beforeClass() {
		// Mở trình duyệt Firefox
		driver = new FirefoxDriver();
		// Set timeout để tìm element
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Mở application lên (AUT / SUT)
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");	
		 
	}
	
	public void TC_01_contains() {
		// Tìm elem bằng cách giá trị nằm trong @tag hay text()
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'Faster')]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(@title,'Create an Account')]")).getText());
		
	}
	
	public void TC_02_startswith() {
		driver.findElement(By.xpath("//a[starts-with(@title,'Create')]\"")).click();
	}
	

	public void TC_03_contains_advanced() {
		// cách lấy text từ nested text
		driver.get("https://automationfc.github.io/basic-form/");
		System.out.println(driver.findElements(By.xpath("//h5[contains(text(),'Michael Jackson')]")).size());
		System.out.println(driver.findElements(By.xpath("//h5[contains(.,'Michael Jackson')]")).size());
		System.out.println(driver.findElements(By.xpath("//h5[contains(string(),'Michael Jackson')]")).size());
		
		//concat để nối chuỗi khi có quá nhiều dấu " và '
		System.out.println(driver.findElement(By.xpath("//span[text()=concat('Hello \"John\", What',\"'s happened?\")]")).getText());
	}

	public void TC_04_Verify_Text() {
		//Get text của elem ra --> Lưu vào 1 biến
		// Biến để kiểm tra text --> hàm Java String (contains)
		String populationText = driver.findElement(By.id("population")).getText();
		System.out.println(populationText);
		Assert.assertTrue(populationText.contains("Afghanistan: 100-200"));
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='population' and contains(.,\"Afghanistan: 100-200\")]")).isDisplayed());
	}
	
	public void TC_05_position() {
		driver.get("http://live.demoguru99.com/index.php/mobile.html");
		System.out.println(driver.findElement(By.xpath("(//button[@title='Add to Cart'])[1]")).getText());
		
		
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}