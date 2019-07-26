import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions

System.setProperty("webdriver.chrome.driver", "C:\\Users\\DAPL-Asset-70\\Desktop\\BrowserDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://workilo.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.linkText("Log In")).click();
Thread.sleep(2000);
driver.findElement(By.id("email_login")).sendKeys("shahbaz.dapl@gmail.com");
driver.findElement(By.id("password_login")).sendKeys("123");
driver.findElement(By.xpath(".//*[@value='Log in']")).click();
//Thread.sleep(3000);
//driver.findElement(By.linkText("Log Out")).click();
Thread.sleep(2000);
Actions action = new Actions(driver);
action.sendKeys(Keys.ESCAPE).build().perform();
Thread.sleep(3000);
driver.quit();