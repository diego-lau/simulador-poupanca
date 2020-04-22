package tasks;

import org.openqa.selenium.WebDriver;
import webobjects.ResultadoSimuladorFormObjects;
import webobjects.SimuladorFormObjects;

public class ResultadoSimuladorTasks {

    private ResultadoSimuladorFormObjects resultadoSimulador;
    private WebDriver navegador;

    public ResultadoSimuladorTasks(WebDriver navegador) {
        this.navegador = navegador;
        resultadoSimulador = new ResultadoSimuladorFormObjects(navegador);
    }

    public boolean checkRefazerSimulacaoButton(){
        return resultadoSimulador.refazerSimulacaoButton().isDisplayed();
    }

    public String valorTotalResultadoSimulacao(){
        return resultadoSimulador.valorTotalResultadoSimulacaoLabel().getText();
    }

}
