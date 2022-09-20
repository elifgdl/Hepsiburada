package tests.android;

import Base.BaseTest;
import Pages.hepsiburadaScenario1;
import Pages.hepsiburadaScenario2;
import org.testng.annotations.Test;

public class hpTests extends BaseTest {
    @Test
    public void hbtest1()  {
        hepsiburadaScenario1 hb1 = new hepsiburadaScenario1(appiumDriver);
        hb1.konumGir().adresKontrolu().rastgeleKategori().lokasyonCheck();
    }
    @Test
    public void hbtest2() {

        hepsiburadaScenario2 hb2 = new hepsiburadaScenario2(appiumDriver);
        hb2.superfiyatsuperteklif().urundetaysayfasi().login().loginkontrol().hesabimagidis();


    }

}
