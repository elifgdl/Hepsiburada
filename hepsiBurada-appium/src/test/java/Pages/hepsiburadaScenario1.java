package Pages;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import static Constants.Constants.*;

public class hepsiburadaScenario1 extends BasePage {

    public hepsiburadaScenario1(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public hepsiburadaScenario1 konumGir() {
        waitSeconds(10);
        click(KONUM);
        waitSeconds(5);
        click(KONUM_IL);
        click(KONUM_SECILI_IL);
        click(KONUM_ILCE);
        click(KONUM_SECILI_ILCE);
        click(KONUM_MAHALLE);
        click(KONUM_SECILI_MAHALLE);
        click(KONUM_KAYDET);
        return this;
    }

    public hepsiburadaScenario1 adresKontrolu() {
        Assert.assertEquals(findElement(KONUM_KAYDET_POPUP_TEXT).getText(), "Konumunuz kaydedildi.");
        click(KONUM_KAYDET_POPUP_KAPAT);
        waitSeconds(5);
        return this;
    }

    public hepsiburadaScenario1 rastgeleKategori() {
        click(TAB_BAR_KATEGORILER);
        waitSeconds(5);
        randomClick(RANDOM_KATEGORI_SECIMI);
        waitSeconds(5);
        return this;
    }

    public hepsiburadaScenario1 lokasyonCheck() {
        Assert.assertEquals(findElement(YARIN_KAPINDA_IL_BILGISI).getText(), "Adana");
        waitSeconds(5);
        return this;

    }


}



