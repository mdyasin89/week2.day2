package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		userName.sendKeys("Demosalesmanager");
		passWord.sendKeys("crmsfa");
		loginButton.click();
		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		WebElement LeadsLink = driver.findElement(By.linkText("Leads"));
		LeadsLink.click();
		WebElement creaeLeadLink = driver.findElement(By.linkText("Create Lead"));
		creaeLeadLink.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		WebElement lasttName = driver.findElement(By.id("createLeadForm_lastName"));
		WebElement lastNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		WebElement createLeadButton = driver.findElement(By.name("submitButton"));
		WebElement emailId = driver.findElement(By.id("createLeadForm_primaryEmail"));
		companyName.sendKeys("MycompanyDuplicate");
		firstName.sendKeys("Mohamed");
		lasttName.sendKeys("Yasin");
		lastNameLocal.sendKeys("TestLocal");
		departmentName.sendKeys("TestDepartment");
		description.sendKeys("Create Lead description");
		emailId.sendKeys("test123@gmail.com");
		WebElement dropStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select objdropStateProvince = new Select(dropStateProvince);
		objdropStateProvince.selectByVisibleText("Alaska");
		createLeadButton.click();
		WebElement duplicateLeadButton = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
		duplicateLeadButton.click();
		WebElement companyName2 = driver.findElement(By.id("createLeadForm_companyName"));
		companyName2.clear();
		companyName2.sendKeys("MycompanyDuplicateNew");
		WebElement firstName2 = driver.findElement(By.id("createLeadForm_firstName"));
		firstName2.clear();
		firstName2.sendKeys("MohamedNew");
		WebElement createLeadButtonNew = driver.findElement(By.xpath("//input[@value='Create Lead']"));
		createLeadButtonNew.click();
		driver.getTitle();
		System.out.println(driver.getTitle());

	}

}
