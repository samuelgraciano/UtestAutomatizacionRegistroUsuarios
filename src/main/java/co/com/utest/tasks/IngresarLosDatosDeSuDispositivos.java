package co.com.utest.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.utest.userinterface.UtestDatosDeDireccion;
import co.com.utest.userinterface.UtestDatosDeDispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarLosDatosDeSuDispositivos implements Task {

    private String computadora;
    private String version;
    private String idiomaComputador;
    private String dispositivoMovil;
    private String modelo;
    private String sitemaOperativoMovil;

    public IngresarLosDatosDeSuDispositivos(String computadora, String version, String idiomaComputador, String dispositivoMovil, String modelo, String sitemaOperativoMovil) {
        this.computadora = computadora;
        this.version = version;
        this.idiomaComputador = idiomaComputador;
        this.dispositivoMovil = dispositivoMovil;
        this.modelo = modelo;
        this.sitemaOperativoMovil = sitemaOperativoMovil;
    }

    public static IngresarLosDatosDeSuDispositivos en(String computadora, String version, String idiomaComputador, String dispositivoMovil, String modelo, String sitemaOperativoMovil) {
        return Tasks.instrumented(IngresarLosDatosDeSuDispositivos.class, computadora, version, idiomaComputador, dispositivoMovil, modelo, sitemaOperativoMovil);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestDatosDeDispositivos.CLICK_ESPACIO_COMPUTADOR),
                WaitFor.seconds(2),
                Click.on(UtestDatosDeDispositivos.COMPUTADOR.of(computadora)),
                Click.on(UtestDatosDeDispositivos.CLICK_ESPACIO_VERSION),
                WaitFor.seconds(2),
                Click.on(UtestDatosDeDispositivos.VERSION.of(version)),
                Click.on(UtestDatosDeDispositivos.CLICK_ESPACIO_LENGUAJE),
                WaitFor.seconds(2),
                Click.on(UtestDatosDeDispositivos.LENGUAJE.of(idiomaComputador)),
                Click.on(UtestDatosDeDispositivos.CLICK_ESPACIO_DISPOSITIVO_MOVIL),
                WaitFor.seconds(4),
                Click.on(UtestDatosDeDispositivos.MOVIL.of(dispositivoMovil)),
                Click.on(UtestDatosDeDispositivos.CLICK_ESPACIO_MODELO),
                WaitFor.seconds(2),
                Click.on(UtestDatosDeDispositivos.MODELO.of(modelo)),
                Click.on(UtestDatosDeDispositivos.CLICK_ESPACIO_SO),
                WaitFor.seconds(2),
                Click.on(UtestDatosDeDispositivos.SISTEMA_OPERATIVO.of(sitemaOperativoMovil)),
                Click.on(UtestDatosDeDispositivos.BOTON_SIGUIENTE)
                );

    }
}
