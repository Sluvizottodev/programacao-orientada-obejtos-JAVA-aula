package modelo;
public class Cliente{
    // Atributos
    private String nome;
    private String cpf;
    private String email;
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getSenha() {
        return this.senha;
    }

    public Cliente(){
    }

    public Cliente(String nome){
        this.setNome(nome);
    }

    public Cliente(String nome, String cpf){
        this(nome); //Invocando um construtor mais completo
        this.setCpf(cpf);
    }

    public Cliente(String nome, String cpf, int senha){
        this(nome, cpf); //Invocando um construtor mais completo
        this.setSenha(senha);
    }
    
    // métodos (comportamento)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 5)
            return;
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (!this.validaCpf(cpf))
            return;
        this.cpf = cpf;
    }

    // método encpsulado
    private boolean validaCpf(String cpf) {
        if (cpf.length() != 11)
            return false;
        else
            return true;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //
    public void mostrarDados() {
        System.out.println("Nome: " + this.getNome());
        //System.out.println("Cpf: " + this.getCpf());
        //System.out.println("E-mail: " + this.getEmail());
    }

}
