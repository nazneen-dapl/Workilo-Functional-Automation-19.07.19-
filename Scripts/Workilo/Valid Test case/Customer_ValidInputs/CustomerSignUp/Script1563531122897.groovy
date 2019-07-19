import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver", "C:\\Users\\DAPL-Asset-70\\Desktop\\BrowserDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://workilo.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.linkText("Sign Up")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Customer']")).click();
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("shahbaz.dapl@gmail.com");
driver.findElement(By.id("firstName")).sendKeys("Shahbaz");
driver.findElement(By.id("lastName")).sendKeys("Farooque");
driver.findElement(By.id("password")).sendKeys("admin#123");
driver.findElement(By.id("contact_number")).sendKeys("9663326168");
driver.findElement(By.xpath(".//*[@value='Sign Up']")).click();
Thread.sleep(5000);
driver.quit();