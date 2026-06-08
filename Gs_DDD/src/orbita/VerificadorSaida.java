package orbita;

import dataset.DatasetItens;

import java.util.Arrays;
import java.util.List;

public class VerificadorSaida {

    public List<DatasetItens> lista() {
        List<DatasetItens> listaFoguete = Arrays.asList(
                new DatasetItens("foguete 1",25000,100000,9931239999L,16344),
                new DatasetItens("foguete 2",13,13,400000L,100000),
                new DatasetItens("foguete 3",1,1,1L,1),
                new DatasetItens("foguete 4",1,1,1L,1),
                new DatasetItens("foguete 5",1,1,1L,1)
        );
        return listaFoguete;
    }

    private double velocidadeMin = 11200;
    private static double deltaVelocidade;

    public void calcularSaidaOrbita(){
        for (DatasetItens datasetItens : lista()) {
            deltaVelocidade = datasetItens.getVelocidadeEstimada() * Math.log(datasetItens.getMassaInicial() / datasetItens.getMassaFinal());
            System.out.println(deltaVelocidade + " m/s");
            if (deltaVelocidade >= velocidadeMin) {
                System.out.println("seu foguete tem uma velocidade maior que " + velocidadeMin/1000 +" km/s, então consegue sair de orbita parabens!!");
            } else {
                System.out.println("seu foguete não tem velocidade de empuxo o suficiente para entrar em orbita, diminua o peso ou aumente a potencia dos motores!");
            }
        }
    }

}
