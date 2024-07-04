package pilares_poo;

public abstract class Veiculo {

    private String chassi;

    public void setChassi(String chassi){
        this.chassi = chassi;
    }

    // Metodo abstrato
    public abstract void ligar();
}
