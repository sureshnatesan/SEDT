package mandatoryHomeWork.selenium.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JiraAutomation {

	
	
	@Test
	public void setup() throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://id.atlassian.com/login?continue=https%3A%2F%2Fid.atlassian.com%2Fjoin%2Fuser-access%3Fresource%3Dari%253Acloud%253Ajira%253A%253Asite%252F448cdd69-9950-4138-acba-41c70729484a%26continue%3Dhttps%253A%252F%252Fapi-training.atlassian.net%252Fjira&application=jira");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hari.radhakrishnan@testleaf.com");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		driver.findElement(By.xpath("//*[text()='SDET-5']/parent::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='createGlobalItem']")).click();
		driver.findElement(By.xpath("//input[@name='summary']")).sendKeys("Suresh Natesan -New automation ticket");
		driver.findElement(By.xpath("//button[@form='issue-create.ui.modal.create-form']")).click();
		driver.findElement(By.xpath("//a[@data-testid='navigation-apps-sidebar-software-classic.ui.menu.backlog-link']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search backlog']")).sendKeys("Suresh Natesan -New automation ticket");
		String value = driver.findElement(By.xpath("//mark[text()='Suresh Natesan -New automation ticket']")).getText();
		Assert.assertTrue(value.contains("Suresh Natesan -New automation ticket"));
		driver.quit();
	}

}
