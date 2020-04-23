package tests;

import org.junit.Assert;
import org.junit.Test;
import suporte.Web;
import tasks.ResultadoSimuladorTasks;
import tasks.SimuladorTasks;


public class SimularInvestimentoAnosTestCase extends Web {

    @Test
    public void SimularInvestimentoAnos(){
        SimuladorTasks simuladorTasks = new SimuladorTasks(navegador);
        simuladorTasks.perfilParaVoceClick();
        simuladorTasks.informaValorAplicar("1000,00");
        simuladorTasks.informaValorPoupar("100,00");
        simuladorTasks.informaTempoPoupar("3");
        simuladorTasks.selecionaTempoPoupar("A");
        simuladorTasks.simularFormulario();

        ResultadoSimuladorTasks resultadoSimuladorTasks = new ResultadoSimuladorTasks(navegador);
        String resultado = resultadoSimuladorTasks.valorTotalResultadoSimulacao();
        System.out.println(resultado);

        Assert.assertEquals(resultadoSimuladorTasks.checkRefazerSimulacaoButton(), true);

    }

}