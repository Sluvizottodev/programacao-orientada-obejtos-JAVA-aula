package questoes_extra_casa.batalha_robos;

public interface Robo {
    void executarAcao() throws AcaoInvalidaException;

    //tendo os métodos na interface posso usar polimorfismo na list de main
    String getNome();
    String getTipo();
    String getEnergia();
}
