package tests;

import org.junit.Assert;
import org.junit.Test;
import suporte.Web;
import tasks.SimuladorTasks;


public class ValorMinimoAplicarTestCase extends Web {

    @Test
    public void ValorMinimoAplicar(){
        SimuladorTasks simuladorTasks = new SimuladorTasks(navegador);
        simuladorTasks.perfilParaEmpresaClick();
        simuladorTasks.informaValorAplicar("19.99");
        simuladorTasks.clickValorInvestir();

        Assert.assertEquals(simuladorTasks.checkValorMinimoAplicarLabel(), true);

    }

}