package destino;

import dataset.DatasetItens;

import java.util.List;

public class VerificarCombustivel {

    TempoDestino planeta = new TempoDestino();

    public String verificadorCombustivel(List<DatasetItens> lista){
        double planetaEscolhido = planeta.destino("Lua");

        for (int i = 0; i < lista.size(); i++) {
            double litros = lista.get(i).getMassaCombustivel() / 0.81;

            double distanciaPorLitro = litros * 10000;

            if(litros >= planetaEscolhido) {
                System.out.println("ok vc tem gasolina para percorrer a distancia ate o planeta!!");
            }
            else {
                System.out.println("o foguete não tem gasolina o suficiente para percorrer ate " + TempoDestino.getPlanetaEscolhido()) ;
            }

        }

        return "";
    }
}
