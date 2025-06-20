package questoes_extra_casa.teleporte_jogo_exception;

public class TesteTeleporte{
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Rafael");
        
        try {
            j1.teletransportar(-121, 232);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally{
            System.out.println("Fim do teste de teleporte.");
        }
    }
}

/*Deve ser composta por:
 Criação de um objeto Jogador de acordo com construtor.
 bloco try-catch-finally para chamar o método teletransportar.
 catch deve imprimir a mensagem da exceção caso try falso.
finally deve imprimir uma mensagem de encerramento (sempre executado).
 */