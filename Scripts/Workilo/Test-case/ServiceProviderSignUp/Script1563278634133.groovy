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
driver.findElement(By.xpath("//*[text()='Service Provider']")).click();
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("test1@gmail.com");
driver.findElement(By.id("firstName")).sendKeys("Workilo");
driver.findElement(By.id("lastName")).sendKeys("Test");
driver.findElement(By.id("password")).sendKeys("admin#123");
driver.findElement(By.id("contact_number")).sendKeys("8521036974");
driver.findElement(By.xpath(".//*[@value='Sign Up']")).click();
Thread.sleep(5000);
driver.quit();