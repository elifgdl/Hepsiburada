package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofMillis;

public class BasePage extends BaseTest {
    public AndroidDriver<MobileElement> appiumDriver;
    public WebDriverWait appiumWait;

    public BasePage(AndroidDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.appiumWait = new WebDriverWait(appiumDriver, 20);
    }

    public MobileElement findElement(By by) {
        appiumWait.until(ExpectedConditions.presenceOfElementLocated(by));
        return appiumDriver.findElement(by);
    }

    public void click(By by) {                                          // tıklama işlemi için yazdım.
        findElement(by).click();
    }

    public List<MobileElement> findElements(By by) {
        appiumWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return appiumDriver.findElements(by);
    }

    public void sendKeys(By by, String text) {
        click(by);
        findElement(by).sendKeys(text);
    }

    public void randomClick(By by) {
        Random random = new Random();
        int randomSayi = random.nextInt(14);
        findElements(by).get(randomSayi + 1).click();
    }

    public void swipeRandom() {
        Dimension size = appiumDriver.manage().window().getSize();

        int startPoint = (int) (size.width * 0.99);
        int endPoint = (int) (size.width * 0.15);
        int ScreenPlace = (int) (size.height * 0.40);
        int y = (int) size.height * 20;

        TouchAction ts = new TouchAction(appiumDriver);
        for (int i = 0; i <= 2; i++) {
            ts.press(PointOption.point(startPoint, ScreenPlace))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(endPoint, ScreenPlace)).release().perform();

        }
    }

    public void waitSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
