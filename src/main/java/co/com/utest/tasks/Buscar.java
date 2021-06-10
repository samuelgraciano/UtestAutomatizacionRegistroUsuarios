package co.com.utest.tasks;

import co.com.utest.userinterface.UtestBuscarOpcionRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Buscar implements Task {



    public static Buscar botonRegistrar(){
        return Tasks.instrumented(Buscar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestBuscarOpcionRegistro.BOTTON_REGISTRAR));

    }
}
