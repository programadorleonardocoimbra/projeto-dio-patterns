package notificacoes.strategy;

public class SMSNotificacao implements NotificacaoStrategy {
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}