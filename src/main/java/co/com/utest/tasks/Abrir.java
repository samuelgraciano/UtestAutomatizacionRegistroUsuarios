package co.com.utest.tasks;

import co.com.utest.userinterface.UtestPaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private UtestPaginaInicio utestPaginaInicio;

    public  static Abrir laPagina(){
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPaginaInicio));

    }
}
