

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
@Test
	public static void method1() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("sruthitenneti431@gmail.com",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("8985383171",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@class = 'gb_8a gbii']")).click();
		driver.findElement(By.xpath("//*[text() ='Compose']")).click();
		driver.findElement(By.name("to"))
		.sendKeys("sruthitenneti431@gmail.com",Keys.ENTER, Keys.TAB, "Hii", Keys.TAB, "Hello!!");
		driver.findElement(By.xpath("//div[text()='Send']")).click();


		
		
		
		
		
			}

}
