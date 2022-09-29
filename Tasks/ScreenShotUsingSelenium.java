package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotUsingSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Log\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fsignup%3Fref_cta%3DSign%2Bup%26ref_loc%3Dheader%2Blogged%2Bout%26ref_page%3D%252F%26source%3Dheader-home";
		driver.manage().window().maximize();
		driver.get(url);
		WebElement username=driver.findElement(By.name("login"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement login=driver.findElement(By.name("commit"));
		username.sendKeys("k2s95me@gmail.com");
		password.sendKeys("k2s1116i*");
		login.click();
	}

}
