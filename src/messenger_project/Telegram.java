package messenger_project;

// Classe herdada de ServicoMensagemInstantanea
public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }
}