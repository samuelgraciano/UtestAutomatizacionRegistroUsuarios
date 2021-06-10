package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDatosDeDireccion {

    public static final Target CIUDAD = Target.the("ingresar la ciudad del usuario").located(By.xpath("//div//input[@id='city']"));
    public static final Target CODIGO_POSTAL = Target.the("ingresar el codigo postal de su direccion").located(By.id("zip"));
    public static final Target CLICK_ESPACIO_PAIS = Target.the("le damos click en el espacio del pais para que abra un submenu").located(By.xpath("//div//span[@class='ui-select-match-text pull-left']"));
    public static final Target PAIS = Target.the("ingresamos el pais seleccionado por el usuario").locatedBy("//div//span[@class='ui-select-choices-row-inner']//div[contains(text(),'{0}')]");
    public static final Target BOTON_SIGUIENTE = Target.the("le damos click al boton siguiente").located(By.xpath("//div//a[@class='btn btn-blue pull-right']"));

}
