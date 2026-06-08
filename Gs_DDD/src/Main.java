import destino.VerificarCombustivel;
import orbita.VerificadorSaida;

public class Main {
    public static void main(String[] args) {
        VerificadorSaida saida = new VerificadorSaida();
        VerificarCombustivel combustivel = new VerificarCombustivel();

        saida.calcularSaidaOrbita();
        System.out.println(combustivel.verificadorCombustivel(saida.lista()));
    }
}