package pilares_poo;

public class Autodromo {
    public static void main(String[] args) {

        Carro civic = new Carro();
        civic.setChassi("1234");
        civic.ligar(); // Metodo abstrato com polimorfismo

        Moto z400 = new Moto();
        z400.setChassi("4321"); // Acessa o método por Herança 'Extends'
        z400.ligar(); // Metodo abstrato com polimorfismo

        // Classe generica, com polimorfismo da classe extendida
        Veiculo coringa = z400;
        coringa.ligar();
    }

}
