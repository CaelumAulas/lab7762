package logica;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DesafioTest {

    private Desafio desafio;

    @Before
    public void setUp() {
        desafio = new Desafio();
    }

    @Test
    public void quandoAPosicaoForUmResultadoDeveSerZero() {
        assertEquals(0, desafio.calculaAte(1));
    }

    @Test
    public void quandoAPosicaoForDoisResultadoDeveSerUm(){
        assertEquals(1, desafio.calculaAte(2));
    }


    @Test
    public void quandoAPosicaoForTresResultadoDeveSerDois(){
        assertEquals(2, desafio.calculaAte(3));
    }


    @Test
    public void quandoAPosicaoForQuatroResultadoDeveSerTres(){
        assertEquals(3, desafio.calculaAte(4));
    }

    @Test
    public void quandoAPosicaoForCincoResultadoDeveSerCinco(){
        assertEquals(5, desafio.calculaAte(5));
    }

    @Test
    public void quandoAPosicaoForSeisResultadoDeveSerOito(){
        assertEquals(8, desafio.calculaAte(6));
    }
}
