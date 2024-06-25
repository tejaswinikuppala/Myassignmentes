package week2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week2day1 {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		assertEquals(title,"Facebook – log in or sign up");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement account=driver.findElement(By.xpath("//a[@role='button' and @data-testid='open-registration-form-button']"));
	 account.click();
	 Thread.sleep(5000);
	 //WebElement firstName =Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	// driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	// WebElement frame =driver.findElement(By.xpath("//div[@class='_n3']"));
	 //driver.switchTo().frame(frame);
	 WebElement firstname1=driver.findElement(By.xpath("//input[@name='firstname']"));
	 firstname1.sendKeys("tejaswini");
	 
	 WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
	 last.sendKeys("kuppala");
	 WebElement first= driver.findElement(By.xpath("//input[@name='reg_email__']"));
	 first.sendKeys("9440680667897897");
	 WebElement pass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
	 pass.sendKeys("password");
	 WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	 Select sc = new Select(day);
	 sc.selectByVisibleText("28");
	 WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	 Select sc1 = new Select(month);
	 sc1.selectByVisibleText("Jun");
	 WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	 Select sc2 = new Select(year);
	 sc2.selectByVisibleText("1996");
	 
	 WebElement gender=driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//label[text()='Female']"));
	 //gender.isEnabled();
	 gender.click();
	 WebElement submit =driver.findElement(By.xpath("//button[@name='websubmit']"));
	 submit.click();
	WebElement alert =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Please enter a valid')]")));
	String m2=alert.getText();
	System.out.println(m2);
				 //WebElement el=driver.findElement(By.xpath("(//i[contains(@class,'_5dbc img sp_98fCI7IVTTz sx_54513f')])[1]"));
	 //String error =el.getText();
	 //System.out.println(error);
	WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'longer than 6 characters')]")));
	String m1=error.getText();
	System.out.println(m1);
//driver.close();
	}

}
