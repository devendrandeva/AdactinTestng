package org.testng.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	static WebElement element;

	/*
	 * ===============================WebDriverInterface
	 * Abstract-methods====================================
	 */
	public static void browserLanch() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void currentUrl() {
		driver.getCurrentUrl();
	}

	public static void title() {
		driver.getTitle();
	}
	/*
	 * =============================================================================
	 * =========================
	 */

	/*
	 * ================================WebElementInterface
	 * Abstract-methods===================================
	 */
	public static void sendkey(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void clickButton(WebElement e) {
		e.click();
	}

	public static String getText(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
	/*
	 * =============================================================================
	 * ========================
	 */

	/*
	 * ================================TakesScreenshotInterface
	 * Abstract-method=============================
	 */
	public static void screenshot(String filelocation) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(filelocation);
		try {
			FileUtils.copyFile(temp, perm);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * =============================================================================
	 * =======================
	 */

	/*
	 * ============================================SelectClass
	 * methods======================================
	 */
	public static void selectValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void selectIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	public static void selectVisbleText(WebElement e, String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}

	public static void deselectValue(WebElement e, String value) {
		Select s = new Select(e);
		s.deselectByValue(value);
	}

	public static void deselectIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);
	}

	public static void deselectVisbleText(WebElement e, String text) {
		Select s = new Select(e);
		s.deselectByVisibleText(text);
	}

	public static void deSelectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}

	public static void getAllSelectedOptions(WebElement e, String text) {
		Select s = new Select(e);
		s.getAllSelectedOptions();
	}

	public static void getFirstSelectedOptions(WebElement e) {
		Select s = new Select(e);
		s.getFirstSelectedOption();
	}

	public static void getOptions(WebElement e) {
		Select s = new Select(e);
		s.getOptions();
	}
	/*
	 * =============================================================================
	 * ========================
	 */

	/*
	 * =======================================ActionsClass
	 * methods==========================================
	 */
	public static void moveCursor(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void doubleClick() {
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}

	public static void contextClick() {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	/*
	 * =============================================================================
	 * ========================
	 */

	/*
	 * =============================JavascriptExecutorInterface
	 * Abstract-methods=============================
	 */
	public static void scrollDown(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void scrollUp(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}

	public static void jsClick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
	}

	public static void jsSendKey(String value1, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + value1 + "');", e);
	}

	public static void jsGetKey(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value')", e);
	}
	/*
	 * =============================================================================
	 * ========================
	 */

	/*
	 * ===================================RobotClass
	 * methods================================================
	 */
	public static void robotDown(int howmanytime) {
		try {
			Robot r = new Robot();
			while (howmanytime > 0) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				howmanytime--;
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void robotUp(int howmanytime) {
		try {
			Robot r = new Robot();
			while (howmanytime > 0) {
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
				howmanytime--;
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void robotEnter() {

		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void robotCopy() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void robotPaste() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	/*
	 * =============================================================================
	 * ========================
	 */

}
