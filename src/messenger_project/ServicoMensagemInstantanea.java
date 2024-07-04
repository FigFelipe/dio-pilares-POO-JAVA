package messenger_project;

public abstract class ServicoMensagemInstantanea {

    // Metodo abstrato, onde cada servico possui regras de negocios exclusivas
    // Todos os serviços fazem a mesma ação, porém ao seu proprio modo
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

}
