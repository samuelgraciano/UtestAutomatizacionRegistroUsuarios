package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestBuscarOpcionRegistro {

    public static final Target BOTTON_REGISTRAR = Target.the("Buscamos el boton para registrar nuevos usuarios").located(By.xpath("//div//a[@class='unauthenticated-nav-bar__sign-up']"));

}
