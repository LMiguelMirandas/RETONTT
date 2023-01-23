package com.bdd.page;

import com.bdd.paths.LoginPath;
import com.bdd.paths.SerchPath;
import com.bdd.util.WebDriverDOM;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.*;


@DefaultUrl("https://www.google.com")
public class LoginPage extends WebDriverDOM {

    LoginPath loginPath = new LoginPath();
    SerchPath serchpath = new SerchPath();


    public LoginPage(WebDriver driver){
        super(driver);
        driver.manage().window().maximize();

    }

    //Metodos de funcionalidad

    public void ingresamosCriterioBuscar(String StrCriterio){
        click(loginPath.txtBuscar);
        sendKeys(StrCriterio+"".valueOf(Keys.ENTER), loginPath.txtBuscar);

     }
    public void seleccionarWikipedia(){
        click(serchpath.btnWiki);

    }
    public void extraerTextoWikipedia(){

        click(serchpath.txtWiki);
        WebElement TextRpta;

        TextRpta = driver.findElement(By.xpath("//*[@id=\"cite_ref-Hassan_18-0\"]//ancestor::p"));
        if (TextRpta.getText().contains("850 d. C.")) {// En este caso será true
            System.out.println("Validacion Exitosa: "+ TextRpta.getText());
        } else {
            System.out.println("Validacion incorrecta"+ TextRpta.getText());
        }

    }





}
