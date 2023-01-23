package com.bdd.util;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class WebDriverDOM extends PageObject {
    public WebDriver driver;

    public WebDriverDOM(WebDriver driver) {
        this.driver = driver;
    }

    public void multipleWindows() {
        String DefaultWindows = driver.getWindowHandle();
        Set<String> childWindows = driver.getWindowHandles();
        for (String child : childWindows) {
            if (!DefaultWindows.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);
            }
        }
    }

    public void click(By locator) {
        driver.findElement(locator);
        elementWait(2000);
        driver.findElement(locator).click();
    }

    public void sendKeys(String inputText, By locator){
        elementWait(2000);
        driver.findElement(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(inputText);

    }
    public void elementWait(By locator){
        WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public List<WebElement> findElements(By locator, String selectText) {
        List<WebElement> elements = driver.findElements(locator);
        for (WebElement el : elements) {
            if (selectText.equals(el.getText())) {
                el.click();
            }
        }
        return elements;
    }


    public Select findElements1(By locator, String selectText) {
        Select elements = new Select(driver.findElement(locator));
        elements.selectByVisibleText(selectText);
        return elements;
    }

    public boolean isVisibleElement(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public void elementWait(int timeout) throws ElementNotVisibleException {
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    public void sleep(int segundos){
        try {
            Thread.sleep(segundos);
        }catch (InterruptedException ie){
        }
    }

    public void findElement2(){
        driver.findElement(By.id("Value")).sendKeys(Keys.RETURN);

    }

    public void actionstAB(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB);
    }
}
