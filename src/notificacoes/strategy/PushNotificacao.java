package notificacoes.strategy;

public class PushNotificacao implements NotificacaoStrategy {
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH: " + mensagem);
    }
}