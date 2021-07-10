package co.com.utest.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.utest.userinterface.UtestDatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarLosDatosContrasena implements Task {
    private String contraseña;

    public IngresarLosDatosContrasena(String contraseña) {
        this.contraseña = contraseña;
    }

    public static IngresarLosDatosContrasena en(String contraseña) {
        return Tasks.instrumented(IngresarLosDatosContrasena.class, contraseña);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(contraseña).into(UtestDatosPersonales.CONTRASEÑA),
                Enter.theValue(contraseña).into(UtestDatosPersonales.CONFIRMAR_CONTRASEÑA),
                Click.on(UtestDatosPersonales.TERMINOS_USO_UTEST),
                Click.on(UtestDatosPersonales.POLITICA_PRIVACIDAD),
               // Click.on(UtestDatosPersonales.BOTON_SIGUIENTE),
                WaitFor.seconds(4)
        );

    }
}
