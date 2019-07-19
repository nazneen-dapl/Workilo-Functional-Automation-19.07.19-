import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver", "C:\\Users\\DAPL-Asset-70\\Desktop\\BrowserDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://workilo.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.linkText("Log In")).click();
Thread.sleep(2000);
driver.findElement(By.id("email_login")).sendKeys("shahbaz.dapl@gmail.com");
driver.findElement(By.id("password_login")).sendKeys("admin#123");
driver.findElement(By.xpath(".//*[@value='Log in']")).click();
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement element = driver.findElement(By.id("img_334"));
js.executeScript("arguments[0].scrollIntoView();", element);
Thread.sleep(2000);
driver.findElement(By.id("img_334")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath(".//*[@class='question-close hide-modal']")).click();
driver.findElement(By.xpath("/html/body/div[6]/i")).click();
WebElement element2 = driver.findElement(By.xpath(".//*[text()='book now']"));
//js.executeScript("arguments[0].scrollIntoView();", element2);
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(2000);
element2.click();
Thread.sleep(3000);
driver.findElement(By.id("step1")).click();
Thread.sleep(3000);
driver.findElement(By.id("billing_address1")).sendKeys("Level 34/630 Defodil ST");
driver.findElement(By.id("billing_city")).click();
Thread.sleep(2000);
WebElement element3 = driver.findElement(By.xpath("//*[@id='tab-2']/div[2]/a[1]"));
js.executeScript("arguments[0].scrollIntoView();", element3);
element3.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='tab-3']/div[2]/a[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='tab-4']/div[1]/div[1]/span")).click();
Thread.sleep(5000);
driver.quit();