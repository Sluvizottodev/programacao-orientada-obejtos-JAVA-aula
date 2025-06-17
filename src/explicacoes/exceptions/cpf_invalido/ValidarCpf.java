package explicacoes.exceptions.cpf_invalido;
public class ValidarCpf{
    public boolean validar(String cpf){
        if (cpf.length() != 11){
            throw new CpfInvalidoException("CPF deve ter 11 dígitos");
        }
        return true; 
    }
}