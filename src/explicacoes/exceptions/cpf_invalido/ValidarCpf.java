package explicacoes.exceptions.cpf_invalido;
public class ValidarCpf{
    public static boolean validar(String cpf){
        if (!cpf.matches("\\d{11}") || cpf == null){
            throw new CpfInvalidoException("CPF deve ter 11 dígitos");
        }
        return true; 
    }
}