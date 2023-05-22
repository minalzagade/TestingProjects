
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions option=new ChromeOptions();
	    //option.addArguments("remote-allow-origins=*");
		//	WebDriver driver = new ChromeDriver(option);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		WebElement CustomerID = driver.findElement(By.xpath("//input[@name='cusid']"));
		CustomerID.sendKeys("53920");
		WebElement SubmitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
		SubmitBtn.click();
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.get("https://demoqa.com/alerts");
	//	WebElement AlertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement TimerAlert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	//	WebElement ConfirmBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement PromptBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		TimerAlert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		PromptBtn.click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Utkarshaa Academy");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

}

