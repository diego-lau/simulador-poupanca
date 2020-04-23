package tasks;

import org.openqa.selenium.WebDriver;
import webobjects.SimuladorFormObjects;

public class SimuladorTasks {

    private SimuladorFormObjects simulador;
    private WebDriver navegador;

    public SimuladorTasks(WebDriver navegador) {
        this.navegador = navegador;
        simulador = new SimuladorFormObjects(navegador);
    }

    public void perfilParaVoceClick(){
        simulador.perFilParaVoce().click();
    }

    public void perfilParaEmpresaClick(){
        simulador.perFilParaEmpresa().click();
    }

    public SimuladorTasks informaValorAplicar(String valor){
        simulador.valorAplicarTextField().sendKeys(valor);
        return this;
    }

    public SimuladorTasks informaValorPoupar(String valor){
        simulador.valorPouparTextField().sendKeys(valor);
        return this;
    }

    public SimuladorTasks informaTempoPoupar(String tempo){
        simulador.tempoPouparTextField().sendKeys(tempo);
        return this;
    }

    public SimuladorTasks selecionaTempoPoupar(String tempo) {
        String mes = "M";
        String ano = "A";
        if(tempo == mes){
            simulador.tempoPouparComboBox().click();
            simulador.tempoMesPouparComboBox().click();
        }else if(tempo == ano){
            simulador.tempoPouparComboBox().click();
            simulador.tempoAnoPouparComboBox().click();
        }
        return this;
    }

    public SimuladorTasks simularFormulario(){
        simulador.submitFormularioButton().click();
        return this;
    }

    public void clickLimparFormulario(){
        simulador.limparFormularioButton().click();
    }

    public boolean checkValorMinimoAplicarLabel(){
        return simulador.valorAplicarErrorLabel().isDisplayed();
    }

    public boolean checkLimparFormulario(){
        return simulador.perFilParaVoce().isSelected() &&
                simulador.valorAplicarTextField().isDisplayed() &&
                simulador.valorPouparTextField().isDisplayed() &&
                simulador.tempoPouparTextField().isDisplayed() &&
                simulador.tempoPouparComboBox().isDisplayed();
    }

    public boolean checkValorMinimoInvestirLabel(){
        return simulador.valorInvestirErrorLabel().isDisplayed();
    }

    public void clickValorAplicar(){
        simulador.valorAplicarTextField().click();
    }

    public void clickValorInvestir(){
        simulador.valorPouparTextField().click();
    }

    public void clickTempoPoupar(){
        simulador.tempoPouparTextField().click();
    }

    public boolean checkValorMaximoAplicarError(){
        return simulador.valorMaximoAplicarError().isDisplayed();
    }

    public boolean checkValorMaximoInvestirError(){
        return simulador.valorInvestirErrorLabel().isDisplayed();
    }

}
