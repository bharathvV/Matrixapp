package corelogic.Matrix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//automation related to matrix web app
public class Practiceautomation {
	
	public static void main(String[] args) throws InterruptedException {
		String firstName = "bhargav";
		String lastName = "enishetty";
		String email_id = "bharathenishetty@mailtutor.com";
		String searchName = "newtest";
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://matrix-released.qa.matrixstaging.com/matrix/");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.id("m_tbName")).sendKeys("t/tstarbuck");
		driver.findElement(By.id("m_tbPassword")).sendKeys("!ts!");
		driver.findElement(By.id("m_imgbtnLogin")).click();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//ul[@id='m_topNavList']/li[2]/a"))).build().perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//ul[@id='m_topNavList']/li[2]/ul/li[3]/a")).click();
		driver.findElement(By.id("m_ucSearchButtons_ctl01")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='S_MultiStatus']/tbody/tr[2]/td/div/input")).click();
		driver.findElement(By.cssSelector("option[title='House']")).click();
		driver.findElement(By.cssSelector("input[id='Fm1118_Ctrl24_TB']")).sendKeys("100-120");
		Thread.sleep(500);
		driver.findElement(By.id("m_ucSearchButtons_m_lbSearch")).click();
		driver.findElement(By.cssSelector("a[id='m_ucResultsPageTabs_m_lbMapTab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='m_ucResultsPageTabs_m_lbResultsTab']")).click();
		driver.findElement(By.id("m_liSaveAsTab")).click();
		driver.findElement(By.cssSelector("a[id='m_lbSaveAsSavedSearch']")).click();
		driver.findElement(By.id("m_tbSearchName")).sendKeys(searchName);
		driver.findElement(By.cssSelector("a[id='m_ucContacts_m_lnkAdd']")).click();
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("input[name*='FirstName']")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input[name*='LastName']")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input[name*='EmailAddress']")).sendKeys(email_id);
		driver.findElement(By.cssSelector("a[id*='btnSave']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='m_lnkSaveSavedSearch']")).click();
		a.moveToElement(driver.findElement(By.xpath("//ul[@id='m_topNavList']/li[4]/a"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='m_topNavList']/li[4]/ul/li[7]/a")).click();
		driver.findElement(By.cssSelector("input[id='m_sscv_m_tbNameFilter']")).sendKeys(firstName);
		Thread.sleep(2000);
		driver.findElement(By.linkText(searchName)).click();
		driver.findElement(By.cssSelector("a[href*='Delete'][data-mtx-track-prop-search-name="+searchName+"]")).click();
		driver.switchTo().alert().accept();
	}
}
