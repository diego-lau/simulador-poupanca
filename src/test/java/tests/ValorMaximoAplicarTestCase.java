package tests;

import org.junit.Assert;
import org.junit.Test;
import suporte.Web;
import tasks.SimuladorTasks;


public class ValorMaximoAplicarTestCase extends Web {

    @Test
    public void valorMaximoAplicar(){
        SimuladorTasks simuladorTasks = new SimuladorTasks(navegador);
        simuladorTasks.perfilParaEmpresaClick();
        simuladorTasks.informaValorAplicar("999999999");
        simuladorTasks.clickValorInvestir();

        Assert.assertEquals(simuladorTasks.checkValorMaximoAplicarError(), true);

    }

}