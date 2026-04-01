package notificacoes.singleton;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instancia;

    private ConfiguracaoSistema() {
        System.out.println("Configuração carregada!");
    }

    public static ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }
}