package webobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SimuladorFormObjects {
    private WebDriver navegador;

    public SimuladorFormObjects(WebDriver navegador){
        this.navegador = navegador;
    }

    public WebElement perFilParaVoce(){
        return navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[1]/input[1]"));
    }

    public WebElement perFilParaEmpresa(){
        return navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[1]/input[2]"));
    }

    public WebElement valorAplicarTextField(){
        return navegador.findElement(By.id("valorAplicar"));
    }

    public WebElement valorPouparTextField(){
        return navegador.findElement(By.id("valorInvestir"));
    }

    public WebElement tempoPouparTextField(){
        return navegador.findElement(By.id("tempo"));
    }

    public WebElement tempoPouparComboBox(){
        return navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[4]/div[2]/div[2]/a"));
    }

    public WebElement tempoMesPouparComboBox(){
        return navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[4]/div[2]/div[2]/ul/li[1]/a"));
    }

    public WebElement tempoAnoPouparComboBox(){
        return navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[4]/div[2]/div[2]/ul/li[2]/a"));
    }

    public WebElement submitFormularioButton(){
        return navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button"));
    }

    public WebElement limparFormularioButton(){
        return navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[1]/a"));
    }

    public WebElement valorAplicarErrorLabel(){
        return navegador.findElement(By.id("valorAplicar-error"));
    }

    public WebElement valorInvestirErrorLabel(){
        return navegador.findElement(By.id("valorInvestir-error"));
    }


}
