package Pages;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import static Constants.Constants.*;

public class hepsiburadaScenario2 extends BasePage {

    public hepsiburadaScenario2(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public hepsiburadaScenario2 superfiyatsuperteklif() {
        click(SUPERFIYAT_SUPERTEKLIF);
        Assert.assertTrue(findElement(SUPERFIYAT_SUPERTEKLIF_URUN_COKFOTOSUVARMI).isDisplayed());
        click(SUPERFIYAT_SUPERTEKLIF_URUN);
        return this;
    }

    public hepsiburadaScenario2 urundetaysayfasi() {
        click(URUN_FOTOSU);
        waitSeconds(2);
        swipeRandom();
        waitSeconds(2);
        click(GORSEL_CARPISI);
        click(FAV_ICON);
        waitSeconds(5);
        return this;
    }

    public hepsiburadaScenario2 login() {
        waitSeconds(5);
        sendKeys(E_MAIL, "elifbgtest@gmail.com");
        click(E_MAIL_GIRIS_YAP);
        sendKeys(SIFRE_GIRIS, "Deneme11");
        click(SIFRE_GIRIS_YAP);
        waitSeconds(5);
        return this;
    }

    public hepsiburadaScenario2 loginkontrol() {
        Assert.assertEquals(findElement(POP_UP_METIN).getText(), "Hoş geldin elif test. Keyifli alışverişler dileriz.");
        click(GIRIS_HOSGELDIN_POPUP);
        waitSeconds(5);
        return this;
    }

    public hepsiburadaScenario2 hesabimagidis() {
        String urunAdi = findElement(URUN_ISMI).getText();
        System.out.println(urunAdi + "Ürün adı bulundu");
        click(GERI_GEL_BUTON);
        click(HESABIM_BUTON);
        click(BEGENDIKLERIM);
        waitSeconds(5);
        click(FAV_URUN_TIKLA);
        waitSeconds(5);
        String favAdi = findElement(URUN_KONTROLU).getText();
        System.out.println(favAdi + "Fav adı bulundu");
        Assert.assertEquals(urunAdi, favAdi);
        return this;

    }
}


















