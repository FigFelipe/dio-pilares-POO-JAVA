package messenger_project;

import messenger_project.apps.FacebookMessenger;
import messenger_project.apps.MSNMessenger;
import messenger_project.apps.ServicoMensagemInstantanea;
import messenger_project.apps.Telegram;

public class ComputadorA {
    public static void main(String[] args) {

        // Objeto abstrato nao instanciado (Polimorfismo)
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
        {
            smi = new MSNMessenger(); // Objeto abstrato instanciado
        }
        else if(appEscolhido.equals("fb"))
        {
            smi = new FacebookMessenger(); // Objeto abstrato instanciado
        }
        else if (appEscolhido.equals("tlg"))
        {
            smi = new Telegram(); // Objeto abstrato instanciado
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
