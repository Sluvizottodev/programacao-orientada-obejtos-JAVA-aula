package explicacoes.exceptions.cpf_invalido;

public class TestarCpf {
    public static void main(String[] args) {
        String cpf = "12345678901";
        try {
            boolean valido = ValidarCpf.validar(cpf);
            System.out.println("CPF válido: " + valido);
        } catch (CpfInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Processo de validação concluído.");
        }
    }
}
