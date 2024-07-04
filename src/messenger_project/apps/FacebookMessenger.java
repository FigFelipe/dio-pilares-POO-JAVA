package messenger_project.apps;

// Classe herdada de ServicoMensagemInstantanea
public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagem");
    }
}
