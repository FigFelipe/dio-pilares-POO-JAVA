package messenger_project;

public class MSNMessenger {
    public void enviarMensagem(){

        validarConectadoInternet(); //Metodo privado encapsulado

        System.out.println("Enviando mensagem");

        salvarHistoricoMensagem(); // Metodo privado encapsulado
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando conexao com a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}
