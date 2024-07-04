package messenger_project;

public class ComputadorA {
    public static void main(String[] args) {

        //Objetos
        MSNMessenger msn = new MSNMessenger();
        FacebookMessenger fb = new FacebookMessenger();
        Telegram tlg = new Telegram();

        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        fb.enviarMensagem();
        fb.receberMensagem();

        System.out.println("Telegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}
