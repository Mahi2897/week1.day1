package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); ;
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click() ;
		driver.findElement(By.linkText("CRM/SFA")).click() ;
		driver.findElement(By.linkText("Contacts")).click();
		//driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Sanjana");
		String name = driver.findElement(By.xpath("//input[@id='firstNameField']")).getAttribute("value");
		System.out.println(name);
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Karthick");
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		

	}

}
