package questoes_extra_casa.teleporte_jogo;

public class TeleporteInvalidoException extends RuntimeException {
    public TeleporteInvalidoException (String message){
        super(message);
    }
    
}

/* Deve ser composta por:
 Um constutor que recebe mensagem de erro e chama o construtor da superclasse.
 Deve herdar de RuntimeException ( PARA TEMPO DE EXECUÇÃO ).
 */