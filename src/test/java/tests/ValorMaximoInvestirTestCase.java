package tests;

import org.junit.Assert;
import org.junit.Test;
import suporte.Web;
import tasks.SimuladorTasks;


public class ValorMaximoInvestirTestCase extends Web {

    @Test
    public void ValorMaximoInvestir(){
        SimuladorTasks simuladorTasks = new SimuladorTasks(navegador);
        simuladorTasks.perfilParaEmpresaClick();
        simuladorTasks.informaValorAplicar("1000,00");
        simuladorTasks.informaValorPoupar("999999999");
        simuladorTasks.clickTempoPoupar();

        Assert.assertEquals(simuladorTasks.checkValorMaximoInvestirError(), true);

    }

}