package co.com.utest.tasks;

import co.com.utest.userinterface.UtestDatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarLosDatosPersonales implements Task {

    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String fechaNaciMes;
    private String fechaNaciDia;
    private String fechaNaciAño;
    private String idioma;

    public IngresarLosDatosPersonales(String nombre, String apellido, String correoElectronico, String fechaNaciMes,
                                      String fechaNaciDia, String fechaNaciAño, String idioma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.fechaNaciMes = fechaNaciMes;
        this.fechaNaciDia = fechaNaciDia;
        this.fechaNaciAño = fechaNaciAño;
        this.idioma = idioma;
    }

    public static IngresarLosDatosPersonales en(String nombre, String apellido, String correoElectronico, String fechaNaciMes,
                                                String fechaNaciDia, String fechaNaciAño, String idioma) {
        return Tasks.instrumented(IngresarLosDatosPersonales.class, nombre, apellido, correoElectronico, fechaNaciMes, fechaNaciDia,
                fechaNaciAño, idioma);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(nombre).into(UtestDatosPersonales.NOMBRE),
                Enter.theValue(apellido).into(UtestDatosPersonales.APELLIDO),
                Enter.theValue(correoElectronico).into(UtestDatosPersonales.CORREO_ELECTRONICO),
                Click.on(UtestDatosPersonales.FECHA_NACIMIENTO_MES.of(fechaNaciMes)),
                Click.on(UtestDatosPersonales.FECHA_NACIMIENTO_DIA.of(fechaNaciDia)),
                Click.on(UtestDatosPersonales.FECHA_NACIMIENTO_AÑO.of(fechaNaciAño)),
                Click.on(UtestDatosPersonales.CLICK_ESPACIO_IDIOMA),
                WaitUntil.the(UtestDatosPersonales.IDIOMA.of(idioma),isVisible()).forNoMoreThan(2).seconds(),
                Click.on(UtestDatosPersonales.BOTON_SIGUIENTE)


                );

    }
}
