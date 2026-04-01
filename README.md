🚀 # Sistema de Notificações em Java

Projeto desenvolvido para demonstrar o uso de Design Patterns na prática utilizando a linguagem Java.

🧠 Sobre o Projeto

Este sistema simula o envio de notificações por diferentes canais, como:

📧 Email
📱 SMS
🔔 Push Notification

O foco principal é aplicar boas práticas de desenvolvimento e padrões de projeto amplamente utilizados no mercado.

🧩 Design Patterns Utilizados
🏭 Factory Pattern

Responsável por centralizar a criação dos objetos de notificação.

🎯 Strategy Pattern

Permite alterar o tipo de envio de notificação dinamicamente.

🔒 Singleton Pattern

Garante que exista apenas uma instância de configuração do sistema.

📂 Estrutura do Projeto
notificacoes/
├── Main.java
├── NotificacaoFactory.java
├── NotificacaoStrategy.java
├── EmailNotificacao.java
├── SMSNotificacao.java
├── PushNotificacao.java
├── ConfiguracaoSistema.java
⚙️ Como Executar
Pré-requisitos
Java JDK 8 ou superior
Passos
# Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git


# Acesse a pasta
cd notificacoes


# Compile o projeto
javac Main.java


# Execute o programa
java Main
🧪 Exemplo de Saída
Configuração carregada!
Enviando EMAIL: Olá, você recebeu uma nova mensagem!
Enviando SMS: Seu código é 1234
Enviando PUSH: Nova promoção disponível!
💡 Aprendizados

Com este projeto, você demonstra conhecimento em:

Organização de código
Separação de responsabilidades
Programação orientada a objetos (POO)
Uso de padrões de projeto
🛠️ Tecnologias Utilizadas
Java
Paradigma Orientado a Objetos
📈 Possíveis Melhorias
Interface gráfica (JavaFX ou Swing)
Integração com APIs reais
Persistência com banco de dados
Testes automatizados (JUnit)
🤝 Contribuição

Sinta-se à vontade para contribuir com melhorias!

Faça um fork do projeto
Crie uma branch (git checkout -b feature/minha-feature)
Commit suas alterações (git commit -m 'Minha melhoria')
Faça um push (git push origin feature/minha-feature)
Abra um Pull Request
📄 Licença

Este projeto está sob a licença MIT.

👨‍💻 Autor

Desenvolvido por Leonardo Coimbra de Paiva