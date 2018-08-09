package logica;

public class Desafio {

    public int calculaAte(int posicao) {

        int atual = 1;
        int anterior = 0;
        int resultado = 0;

        for (int i = 1; i < posicao; i++) {
            resultado = atual + anterior;
            anterior = atual;
            atual = resultado;

        }

        return resultado;
    }
}
