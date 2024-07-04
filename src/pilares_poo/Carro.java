package pilares_poo;

public class Carro extends Veiculo{

    public void ligar(){
        verificaCambio(); // Metodo encapsulado
        verificarCombustivel(); // Metodo encapsulado
        System.out.println("Carro ligado");
    }

    private void verificarCombustivel(){
        System.out.println("Conferindo combustível...");
    }

    private void verificaCambio(){
        System.out.println("Verificando cambio em P");
    }

}
