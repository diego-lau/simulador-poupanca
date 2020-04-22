package suporte;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    public static WebDriver createChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\users\\diegob\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");

        return navegador;
    }


//    @After
//    public void tearDown(){
//        navegador.quit();
//    }

}
