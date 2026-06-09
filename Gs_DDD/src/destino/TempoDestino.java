package destino;

public class TempoDestino {
    private static double distanciaKm;
    private static String planetaEscolhido;

    public double destino(String destino) {
        switch (destino.toLowerCase()) {
            case "lua":
                distanciaKm = 384400;
                break;
            case "mercurio":
                distanciaKm = 91700000;
                break;
            case "venus":
                distanciaKm = 41400000;
                break;
            case "marte":
                distanciaKm = 78300000;
                break;
            case "jupiter":
                distanciaKm = 628700000;
                break;
            case "saturno":
                distanciaKm = 1275000000;
                break;
            case "urano":
                distanciaKm = 2724000000.0;
                break;
            case "netuno":
                distanciaKm = 4351000000.0;
                break;
            default:
                throw new IllegalArgumentException("Destino não encontrado esta fora do sistema solar!");
        }
        planetaEscolhido = destino.toLowerCase();
        return distanciaKm;
    }

    public static String getPlanetaEscolhido() {
        return planetaEscolhido;
    }

}
