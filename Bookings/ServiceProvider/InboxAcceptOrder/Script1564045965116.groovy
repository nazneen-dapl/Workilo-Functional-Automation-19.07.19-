import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.interactions.Actions as Actions

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\DAPL-Asset-70\\Desktop\\BrowserDriver\\chromedriver.exe')

WebDriver driver = new ChromeDriver()

driver.manage().window().maximize()

driver.get('http://workilo.com')

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)

driver.findElement(By.linkText('Log In')).click()

Thread.sleep(2000)

driver.findElement(By.id('email_login')).sendKeys('testworkilo@gmail.com')

driver.findElement(By.id('password_login')).sendKeys('admin@123')

driver.findElement(By.xpath('.//*[@value=\'Log in\']')).click()

Thread.sleep(3000)

driver.findElement(By.xpath('/html/body/header/div/span[1]')).click()

Thread.sleep(1000)

driver.findElement(By.xpath('/html/body/div[4]/div/div[1]/ul/li[1]/a')).click()

Thread.sleep(1000)

driver.findElement(By.xpath('//*[@id=\'tab-1\']/div[1]/table/tbody/tr[1]/td[4]')).click()

Thread.sleep(2000)

//WebElement acceptButton = driver.findElement(By.xpath('/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]'))
WebElement button1 = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[1]/div[1]/a[2]"))
boolean message = button1.isDisplayed()
System.out.println("Message == "+message)
if (button1.isDisplayed()==false) {

    driver.findElement(By.xpath('/html/body/header/div/span[1]')).click()

    Thread.sleep(2000)

    driver.findElement(By.linkText('Sign Out')).click()

    Thread.sleep(1000)

    Actions action = new Actions(driver)

    action.sendKeys(Keys.ESCAPE).build().perform()

    Thread.sleep(2000)

    driver.quit()
} else {
       driver.findElement(By.xpath('/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[1]/div[1]/a[2]')).click()

    Thread.sleep(2000)

    driver.findElement(By.xpath('/html/body/div[16]/button[2]')).click()

    /*For click on cancel button
	driver.findElement(By.xpath("/html/body/div[16]/button[1]")).click()
	*/
    //js.executeScript('arguments[0].style.border=\'3px solid red\'', driver.findElement(By.xpath('/html/body/div[6]/div[1]')))
    Thread.sleep(3000)
	
	
	driver.findElement(By.xpath('/html/body/header/div/span[1]')).click()
	
		Thread.sleep(2000)
	
		driver.findElement(By.linkText('Sign Out')).click()
	
		Thread.sleep(1000)
	
		Actions action = new Actions(driver)
	
		action.sendKeys(Keys.ESCAPE).build().perform()
	
		Thread.sleep(2000)
	
		driver.quit()
}