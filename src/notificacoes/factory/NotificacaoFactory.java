package notificacoes.factory;

import notificacoes.strategy.EmailNotificacao;
import notificacoes.strategy.NotificacaoStrategy;
import notificacoes.strategy.PushNotificacao;
import notificacoes.strategy.SMSNotificacao;

public class NotificacaoFactory {

    public static NotificacaoStrategy criarNotificacao(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new EmailNotificacao();
        } else if (tipo.equalsIgnoreCase("sms")) {
            return new SMSNotificacao();
        } else if (tipo.equalsIgnoreCase("push")) {
            return new PushNotificacao();
        } else {
            throw new IllegalArgumentException("Tipo de notificação inválido!");
        }
    }
}