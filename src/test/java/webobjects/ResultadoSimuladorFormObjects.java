package webobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadoSimuladorFormObjects {
    private WebDriver navegador;

    public ResultadoSimuladorFormObjects(WebDriver navegador){
        this.navegador = navegador;
    }

    public WebElement refazerSimulacaoButton(){
        return navegador.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/a"));
    }

    public WebElement valorTotalResultadoSimulacaoLabel(){
        return navegador.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/span[2]"));
    }

}
