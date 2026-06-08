package dataset;

public class DatasetItens {
    private String nomeFoguete;
    private double velocidadeExaustao;
    private double massaInicial;
    private double massaFinal;
    private double velocidadeEstimada;
    private Long massaCombustivel;
    private double masssaFoguete;

    public DatasetItens(String nomeFoguete, double velocidadeExaustao, double velocidadeEstimada, Long massaCombustivel, double masssaFoguete) {
        this.nomeFoguete = nomeFoguete;
        this.velocidadeExaustao = velocidadeExaustao;
        this.massaInicial = massaCombustivel + masssaFoguete;
        this.massaFinal = massaInicial * Math.pow(2.718 ,-velocidadeEstimada/velocidadeExaustao);
        this.velocidadeEstimada = velocidadeEstimada;
        this.massaCombustivel = massaCombustivel;
        this.masssaFoguete = masssaFoguete;
    }

    public double getMassaInicial() {
        return massaInicial;
    }

    public double getMassaFinal() {
        return massaFinal;
    }

    public double getVelocidadeEstimada() {
        return velocidadeEstimada;
    }

    public double getMassaCombustivel() {
        return massaCombustivel;
    }
}


