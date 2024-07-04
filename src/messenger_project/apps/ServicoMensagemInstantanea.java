package messenger_project.apps;

public abstract class ServicoMensagemInstantanea {

    // Metodo abstrato, onde cada servico possui regras de negocios exclusivas
    // Todos os serviços fazem a mesma ação, porém ao seu proprio modo

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();

    // somente os filhos conhecem este método (Protected)
    // desde que a classe main esteja em um outro pacote
    protected void validarConectadoInternet(){
        System.out.println("Validando conexao com a internet");
    }
}
