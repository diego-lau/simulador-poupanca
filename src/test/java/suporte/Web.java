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

    private static String diretorioUsuario = System.getProperty("user.dir");

    public static WebDriver createChrome() {
        System.out.println(diretorioUsuario);
        System.setProperty("webdriver.chrome.driver", diretorioUsuario + "\\driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");

        return navegador;
    }


    @After
    public void tearDown(){
        navegador.quit();
    }

}
