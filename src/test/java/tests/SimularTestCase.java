package tests;

import org.junit.Assert;
import org.junit.Test;
import suporte.Web;
import tasks.ResultadoSimuladorTasks;
import tasks.SimuladorTasks;


public class SimularTestCase extends Web {

    @Test
    public void simular(){
        SimuladorTasks simuladorTasks = new SimuladorTasks(navegador);
        simuladorTasks.perfilParaEmpresaClick();
        simuladorTasks.informaValorAplicar("1000,00");
        simuladorTasks.informaValorPoupar("100,00");
        simuladorTasks.informaTempoPoupar("12");
        simuladorTasks.selecionaTempoPoupar("M");
        simuladorTasks.simularFormulario();

        ResultadoSimuladorTasks resultadoSimuladorTasks = new ResultadoSimuladorTasks(navegador);
        String resultado = resultadoSimuladorTasks.valorTotalResultadoSimulacao();
        System.out.println(resultado);

        Assert.assertEquals(resultadoSimuladorTasks.checkRefazerSimulacaoButton(), true);

    }

}