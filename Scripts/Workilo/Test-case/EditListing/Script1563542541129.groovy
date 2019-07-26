import java.util.concurrent.TimeUnit as TimeUnit

import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.support.ui.Select

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\DAPL-Asset-70\\Desktop\\BrowserDriver\\chromedriver.exe')

WebDriver driver = new ChromeDriver()

driver.manage().window().maximize()

driver.get('http://workilo.com')

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)

driver.findElement(By.linkText('Log In')).click()

Thread.sleep(2000)

driver.findElement(By.id('email_login')).sendKeys('test1@gmail.com')

driver.findElement(By.id('password_login')).sendKeys('admin@123')

driver.findElement(By.xpath('.//*[@value=\'Log in\']')).click()

Thread.sleep(3000)

driver.findElement(By.xpath('/html/body/header/div/span[1]')).click()

Thread.sleep(2000)

driver.findElement(By.xpath('/html/body/div[4]/div/div[3]/ul/li[1]/a')).click()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.scrollBy(0,500)')

List<WebElement> listItem = driver.findElements(By.xpath('/html/body/div[6]/div/div/div/div/div[2]/div'))

System.out.println('Total Number of List Item == ' + listItem.size())

if (listItem.size() == 0) {
    driver.quit()
}

for (int i = 0; i < listItem.size(); i++) {
    //System.out.println('Count==' + (i+1))
    if (i == 1) {
        //driver.quit()
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div["+i+"]/div/div[3]/a[1]")).click()
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.name("category")))
		Thread.sleep(2000)
		driver.findElement(By.id("total_price")).clear()
		Thread.sleep(1000)
		driver.findElement(By.id("total_price")).sendKeys("10");
		//Select travel = new Select(driver.findElement(By.id('miles_travel')))
		//travel.selectByValue('10')
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)")
		driver.findElement(By.xpath("//*[@id='editlising']/div[2]/input")).click()
    } 
}
js.executeScript('window.scrollBy(0,500)')
Thread.sleep(3000)
driver.quit()