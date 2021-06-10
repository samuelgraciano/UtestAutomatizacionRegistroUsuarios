package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDatosPersonales {

    public static final Target NOMBRE = Target.the("ingresar el nombre del usuario").located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("ingresar el apellido del usuario").located(By.id("lastName"));
    public static final Target CORREO_ELECTRONICO = Target.the("ingresar el correo electronico del usuario").located(By.id("email"));
    public static final Target FECHA_NACIMIENTO_MES = Target.the("ingresar el mes de nacimiento del usuario").locatedBy("//div//option[@label='{0}']");
    public static final Target FECHA_NACIMIENTO_DIA = Target.the("ingresar el dia de nacimiento del usuario").locatedBy("//div//option[@label='{0}']");
    public static final Target FECHA_NACIMIENTO_AÑO = Target.the("ingresar el año de nacimiento del usuario").locatedBy("//div//option[@label='{0}']");
    public static final Target CLICK_ESPACIO_IDIOMA = Target.the("le damos click en el espacio del idioma para que abra un submenu").located(By.xpath("//div//input[@type='search']"));
    public static final Target IDIOMA = Target.the("ingresamos el idioma seleccionado por el usuario").locatedBy("//div//span[@class='ui-select-choices-row-inner']//div[contains(text(),'{0}')]");
    public static final Target BOTON_SIGUIENTE = Target.the("le damos click al boton siguiente").located(By.xpath("//div//a[@class='btn btn-blue']"));

    public static final Target CONTRASEÑA = Target.the("ingresar la contraseña que quiere registrar").located(By.id("password"));
    public static final Target CONFIRMAR_CONTRASEÑA = Target.the("confirme la contraseña que quiere registrar").located(By.id("confirmPassword"));
    public static final Target TERMINOS_USO_UTEST = Target.the("aceptamos los terminos de uso de la pagina utest").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target POLITICA_PRIVACIDAD = Target.the("aceptamos las politicas de privacidad y seguridad de uso de la pagina utest").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));


}
