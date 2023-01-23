package com.bdd.steps;

import com.bdd.page.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPage loginPage;

    @Step
    public void abrirPaginaGoogle(){
        loginPage.open();
    }
    @Step
    public void ingresamosCriterioBuscar(String StrCriterio){
        loginPage.ingresamosCriterioBuscar(StrCriterio);
    }
    @Step
    public void seleccionarWikipedia()  {
        loginPage.seleccionarWikipedia();
    }
    @Step
    public void validarAnioWikipedia()  {
        loginPage.extraerTextoWikipedia();
    }


}
