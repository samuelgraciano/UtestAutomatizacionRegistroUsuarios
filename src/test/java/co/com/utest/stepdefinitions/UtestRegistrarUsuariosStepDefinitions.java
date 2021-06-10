package co.com.utest.stepdefinitions;

import co.com.utest.model.UtestDatos;
import co.com.utest.tasks.*;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestRegistrarUsuariosStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere registrarse en uTest$")
    public void laPersonaQuiereRegistrarseEnUTest(String nombreActor) {
        OnStage.theActorCalled(nombreActor).wasAbleTo(Abrir.laPagina());

    }


    @Cuando("^la persona busca la opcion para registrarse$")
    public void buscaLaOpcionParaRegistrarse() {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.botonRegistrar());
    }

    @Entonces("^debe llenar los datos personales$")
    public void llenarDatosPersonales(List<UtestDatos> utestDatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarLosDatosPersonales.en(utestDatosList.get(0).getNombre(), utestDatosList.get(0).getApellido(),
                utestDatosList.get(0).getCorreoElectronico(), utestDatosList.get(0).getFechaNaciMes(), utestDatosList.get(0).getFechaNaciDia(),
                utestDatosList.get(0).getFechaNaciAño(), utestDatosList.get(0).getIdioma()));

    }

    @Y("^debe llenar los datos de su direccion$")
    public void debeLlenarLosDatosDeSuDireccion(List<UtestDatos> utestDatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarLosDatosDeLaDireccion.en(utestDatosList.get(0).getCiudad(), utestDatosList.get(0).getCodigoPostal(),
                utestDatosList.get(0).getPais()));

    }

    @Y("^debe llenar los datos de sus dispositivos$")
    public void debeLlenarLosDatosDeSusDispositivos(List<UtestDatos> utestDatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarLosDatosDeSuDispositivos.en(utestDatosList.get(0).getComputadora(), utestDatosList.get(0).getVersion(),
                utestDatosList.get(0).getIdiomaComputador(),utestDatosList.get(0).getDispositivoMovil(),utestDatosList.get(0).getModelo(),
                utestDatosList.get(0).getSitemaOperativoMovil()));

    }

    @Y("^debes crear una contraseña$")
    public void debeCrearContraseña(List<UtestDatos> utestDatosList) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarLosDatosContrasena.en(utestDatosList.get(0).getContraseña()));

    }

}
