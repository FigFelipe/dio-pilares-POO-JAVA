package messenger_project;

public class ServicoMensagemInstantanea {

    public void enviarMensagem(){

        //1. Confirmar conexao com a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");

        //2. Salvar o histórico de mensagem
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado à internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico de mensagem");
    }
}
