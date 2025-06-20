package questoes_extra_casa.batalha_robos;

import java.util.List;

public class RoboArena implements Robo {
    private String nome;
    private String tipo;
    private String energia;

    public RoboArena(String nome, String tipo, String energia) throws AcaoInvalidaException {
        this.setNome(nome);
        this.setTipo(tipo);
        this.setEnergia(energia);
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws AcaoInvalidaException {
        if (!List.of("ataque", "defesa", "suporte").contains(tipo.toLowerCase())) {
            throw new AcaoInvalidaException("Tipo de robô inválido: " + tipo);
        }
        this.tipo = tipo;
    }

    @Override
    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }

    @Override
    public void executarAcao() {
        switch (tipo.toLowerCase()) {
            case "ataque":
                System.out.println("Dispara canhões");
                break;
            case "defesa":
                System.out.println("Ativa escudo");
                break;
            case "suporte":
                System.out.println("Repara aliados");
                break;
        }
    }
}
