package questoes_extra_casa.teleporte_jogo;

public class Jogador {
    private String nome;

    public Jogador (String nome){
        this.nome = nome;
    }

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void teletransportar(int x, int y) throws TeleporteInvalidoException{
        if(x < 0 || y < 0){
            throw new TeleporteInvalidoException("Posição inválida!");
        }
        System.out.println("O jogador foi teleportado para (" + x + ", "+ y + ")");
    }
}

/*Deve ser composta por:
 Atributos.
 Construtor que recebe atributos
 Condicao para verificar integridade dos atributos.
 Método que lança exceção com 'throw new Excecao("mensagem")'
 */