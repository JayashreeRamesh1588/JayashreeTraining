package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {

		// Setup the chromedriver using webdrivermanager software
		WebDriverManager.chromedriver().setup();

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL using get
		driver.get("http://leaftaps.com/opentaps");

		// Maximize the window
		driver.manage().window().maximize();

		// Find the username and type the value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Find the password and type the value
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Find the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();

		// verify the title
		String title = driver.getTitle();
		System.out.println(title);

		// Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click Create Lead link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Find the CompanyName and type the value
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");

		// Find the FirstName and type the value
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jaya");

		// Find the LastName and type the value
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shree");

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
	

		Select dropdown = new Select(source);

		// Select the source drop down with one of the visible test

		dropdown.selectByVisibleText("Employee");

		// Select the marketing campaign with one of the value

		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select marketdropdown = new Select(marketingCampaign);

		marketdropdown.selectByValue("CATRQ_AUTOMOBILE");

		// Click Create Lead Lead link
		driver.findElement(By.className("smallSubmit")).click();

		// verify the title
		String newTitle = driver.getTitle();
		System.out.println(newTitle);

	}

}
