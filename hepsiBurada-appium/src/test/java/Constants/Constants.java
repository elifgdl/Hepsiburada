package Constants;

import org.openqa.selenium.By;

public class Constants {
    public static final By KONUM = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup");
    public static final By KONUM_IL = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.view.ViewGroup");
    public static final By KONUM_SECILI_IL = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    public static final By KONUM_ILCE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.view.ViewGroup");
    public static final By KONUM_SECILI_ILCE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    public static final By KONUM_MAHALLE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[3]/android.view.ViewGroup");
    public static final By KONUM_SECILI_MAHALLE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    public static final By KONUM_KAYDET = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
    public static final By KONUM_KAYDET_POPUP_TEXT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView");
    public static final By KONUM_KAYDET_POPUP_KAPAT = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView[2]");
    public static final By TAB_BAR_KATEGORILER = By.xpath("//android.widget.ImageView[@content-desc='Kategoriler']");
    public static final By YARIN_KAPINDA_IL_BILGISI = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView");
    public static final By RANDOM_KATEGORI_SECIMI = By.xpath("//android.widget.ImageView");

   // SENARYO 2
    public static final By SUPERFIYAT_SUPERTEKLIF = By.id("com.pozitron.hepsiburada:id/dod_all");
    public static final By SUPERFIYAT_SUPERTEKLIF_URUN_COKFOTOSUVARMI = By.id("com.pozitron.hepsiburada:id/pi_product_list_item_image");
    public static final By SUPERFIYAT_SUPERTEKLIF_URUN = By.xpath("//android.widget.ImageView[@content-desc='ürün fotoğrafı']");
    public static final By URUN_FOTOSU = By.id("com.pozitron.hepsiburada:id/productImage");
    public static final By GORSEL_CARPISI = By.id("com.pozitron.hepsiburada:id/leftIcon");
    public static final By FAV_ICON = By.id("com.pozitron.hepsiburada:id/product_detail_favourites");
    public static final By URUN_ISMI = By.id("com.pozitron.hepsiburada:id/productName");
    public static final By E_MAIL = By.xpath("//android.webkit.WebView[@content-desc='Üye Giriş Sayfası & Üye Ol - Hepsiburada']/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText");
    public static final By E_MAIL_GIRIS_YAP = By.xpath("//android.widget.Button[@content-desc='Giriş yap']");
    public static final By SIFRE_GIRIS = By.xpath("//android.webkit.WebView[@content-desc='Üye Giriş Sayfası & Üye Ol - Hepsiburada']/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.widget.EditText");
    public static final By SIFRE_GIRIS_YAP= By.xpath("//android.widget.Button[@content-desc='Giriş yap']");
    public static final By GIRIS_HOSGELDIN_POPUP = By.id("android:id/button1");
    public static final By POP_UP_METIN = By.id("android:id/message");
    public static final By GERI_GEL_BUTON = By.id("com.pozitron.hepsiburada:id/leftIcon");
    public static final By HESABIM_BUTON = By.id("com.pozitron.hepsiburada:id/iv_toolbar_user_account_menu");
    public static final By BEGENDIKLERIM = By.xpath("//android.view.ViewGroup[@content-desc='account_menu_5']/android.view.View");
    public static final By FAV_URUN_TIKLA = By.xpath("//android.view.View[@content-desc='123']/android.view.View/android.view.View/android.view.View");
    public static final By URUN_KONTROLU = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[2]");


}
