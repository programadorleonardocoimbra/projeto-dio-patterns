package notificacoes.Main;

import notificacoes.factory.NotificacaoFactory;
import notificacoes.singleton.ConfiguracaoSistema;
import notificacoes.strategy.NotificacaoStrategy;

public class Main {

    public static void main(String[] args) {

        // Singleton sendo utilizado
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();

        // Factory + Strategy
        NotificacaoStrategy notificacao = NotificacaoFactory.criarNotificacao("email");
        notificacao.enviar("Olá, você recebeu uma nova mensagem!");

        NotificacaoStrategy notificacao2 = NotificacaoFactory.criarNotificacao("sms");
        notificacao2.enviar("Seu código é 1234");

        NotificacaoStrategy notificacao3 = NotificacaoFactory.criarNotificacao("push");
        notificacao3.enviar("Nova promoção disponível!");
    }
}