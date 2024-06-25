package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week2day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
		
		// maximize the window 
		driver.manage().window().maximize();
		
		//Login to the leaftaps
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//ul[@class='shortcuts']//li/a[text()='Find Leads']")).click();
driver.findElement(By.xpath("//span[text()='Email']/preceding::span[text()='Phone']")).click();
driver.findElement(By.xpath("//div[@class='x-plain x-plain-noborder']/following::input[@name='phoneNumber']")).sendKeys("9440680667");
driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
Thread.sleep(5000);
WebElement id=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']"));
String st=id.getText();
id.click();
System.out.println(st);
driver.findElement(By.xpath("//div[@class='frameSectionExtra']/following::a[text()='Delete']")).click();
driver.findElement(By.xpath("//ul[@class='shortcuts']//li/a[text()='Find Leads']")).click();
driver.findElement(By.xpath("//div[@class='x-form-element']/following::input[@name='id']")).sendKeys(st);
driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
Thread.sleep(2000);
String ou=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
System.out.println(ou);
	}

}
