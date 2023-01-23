package com.bdd.stepsdefinition;

import com.bdd.config.ExcelReader;
import com.bdd.steps.LoginSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class LoginStepdefinition {

    ExcelReader reader = new ExcelReader();
    List<Map<String,String>> testData;
    @Steps
    LoginSteps Login;

    @Dado("^Abrimos la web google$")
    public void abrimos_web_google() {
        Login.abrirPaginaGoogle();
    }

    @Cuando("ingresamos criterio a buscar \"([^\"]*)\"")
    public void ingresamosCriterioBuscar(String StrBuscar){
        Login.ingresamosCriterioBuscar(StrBuscar);

    }
    @Y("^seleccionar Wikipedia$")
    public void seleccionarWikipedia()  {
        Login.seleccionarWikipedia();
    }

    @Y("^verificar año de primer proceso auotmático$")
    public void verificarAnioPrimerProcesoAuotmático()  {
        Login.validarAnioWikipedia();
    }

}
