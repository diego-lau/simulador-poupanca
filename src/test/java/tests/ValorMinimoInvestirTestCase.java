package tests;

import org.junit.Assert;
import org.junit.Test;
import suporte.Web;
import tasks.SimuladorTasks;


public class ValorMinimoInvestirTestCase extends Web {

    @Test
    public void valorMinimoInvestir(){
        SimuladorTasks simuladorTasks = new SimuladorTasks(navegador);
        simuladorTasks.perfilParaEmpresaClick();
        simuladorTasks.informaValorAplicar("20,00");
        simuladorTasks.informaValorPoupar("19,00");
        simuladorTasks.clickTempoPoupar();

        Assert.assertEquals(simuladorTasks.checkValorMinimoInvestirLabel(), true);

    }

}