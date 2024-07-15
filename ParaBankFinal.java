package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParaBankFinal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prabhu\\eclipse-workspace\\prabhu\\Java_Selenium1\\driver\\chromedriver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.name("username"));
		login.click();
		login.sendKeys("prabhu03");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("prabhu03");
		
		WebElement logclick = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		logclick.click();
		
		WebElement BillPay = driver.findElement(By.xpath("//a[@href=\"billpay.htm\"]"));
		BillPay.click();
		
		WebElement PayeeName = driver.findElement(By.name("payee.name"));
		PayeeName.sendKeys("Electricity");
		
		WebElement Address = driver.findElement(By.name("payee.address.street"));
		Address.sendKeys("No.5, Blueberry Street");
		
		WebElement City = driver.findElement(By.name("payee.address.city"));
		City.sendKeys("Chennai");
		
		WebElement State = driver.findElement(By.name("payee.address.state"));
		State.sendKeys("Tamilnadu");
		
		WebElement Zipcode = driver.findElement(By.name("payee.address.zipCode"));
		Zipcode.sendKeys("600001");
		
		WebElement PhNO = driver.findElement(By.name("payee.phoneNumber"));
		PhNO.sendKeys("9876543210");
		
		WebElement AccNo = driver.findElement(By.name("payee.accountNumber"));
		AccNo.sendKeys("123456789");
		
		WebElement VerifyAcc = driver.findElement(By.name("verifyAccount"));
		VerifyAcc.sendKeys("123456789");

		WebElement Amount = driver.findElement(By.name("amount"));
		Amount.sendKeys("100");

		WebElement FromAcc = driver.findElement(By.name("fromAccountId"));
		FromAcc.click();
		
		Select a = new Select(FromAcc);
		a.selectByVisibleText("13677");
		
		WebElement Send = driver.findElement(By.xpath("//input[@type=\"button\"]"));
		Send.click();
}
}
