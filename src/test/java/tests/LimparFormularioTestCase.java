package tests;

import org.junit.Assert;
import org.junit.Test;
import suporte.Web;
import tasks.SimuladorTasks;


public class LimparFormularioTestCase extends Web {

    @Test
    public void LimparFormulario(){
        SimuladorTasks simuladorTasks = new SimuladorTasks(navegador);
        simuladorTasks.perfilParaEmpresaClick();
        simuladorTasks.informaValorAplicar("1000,00");
        simuladorTasks.informaValorPoupar("100,00");
        simuladorTasks.informaTempoPoupar("12");
        simuladorTasks.selecionaTempoPoupar("A");
        simuladorTasks.clickLimparFormulario();

        Assert.assertEquals(simuladorTasks.checkLimparFormulario(),true);
    }
}