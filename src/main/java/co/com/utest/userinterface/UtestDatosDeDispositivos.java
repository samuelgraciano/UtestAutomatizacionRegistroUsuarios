package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDatosDeDispositivos {
    public static final Target CLICK_X_COMPUTADOR = Target.the("cancelamos lo que se detecta por defecto").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/a/i"));
    public static final Target CLICK_ESPACIO_COMPUTADOR = Target.the("le damos click en el espacio del computador para que abra un submenu").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target COMPUTADOR = Target.the("ingresamos el computador seleccionado por el usuario").locatedBy("//div//span[@class='ui-select-choices-row-inner']//div[contains(text(),'{0}')]");
    public static final Target CLICK_ESPACIO_VERSION = Target.the("le damos click en el espacio de la version del computador para que abra un submenu").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span/i"));
    public static final Target VERSION = Target.the("ingresamos la version del computador seleccionado por el usuario").locatedBy("//div//span[@class='ui-select-choices-row-inner']//div[contains(text(),'{0}')]");
    public static final Target CLICK_ESPACIO_LENGUAJE = Target.the("le damos click en el espacio de lenguaje del computador para que abra un submenu").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/i"));
    public static final Target LENGUAJE = Target.the("ingresamos el lenguaje del computador seleccionado por el usuario").locatedBy("//div//span[@class='ui-select-choices-row-inner']//div[contains(text(),'{0}')]");
    public static final Target CLICK_ESPACIO_DISPOSITIVO_MOVIL = Target.the("le damos click en el espacio dispositivio movil para que abra un submenu").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target MOVIL = Target.the("ingresamos el celular seleccionado por el usuario").locatedBy("//div//span[@class='ui-select-choices-row-inner']//div[contains(text(),'{0}')]");
    public static final Target CLICK_ESPACIO_MODELO = Target.the("le damos click en el espacio modelo para que abra un submenu").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span/i"));
    public static final Target MODELO = Target.the("ingresamos el modelo del celular").locatedBy("//div//span[@class='ui-select-choices-row-inner']//div[contains(text(),'{0}')]");
    public static final Target CLICK_ESPACIO_SO = Target.the("le damos click en el espacio sistema operativo para que abra un submenu").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span/i"));
    public static final Target SISTEMA_OPERATIVO = Target.the("ingresamos el sistema operativo del celular").locatedBy("//div//span[@class='ui-select-choices-row-inner']//div[contains(text(),'{0}')]");
    public static final Target BOTON_SIGUIENTE = Target.the("le damos click al boton siguiente").located(By.xpath("//div//a[@class='btn btn-blue pull-right']"));


}
