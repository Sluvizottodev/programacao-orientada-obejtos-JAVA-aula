package modelo;

public class Usuario {
    private String nome;
    private int id;

    public void mostrarDados(){
        System.out.println("Id: "+this.id+" - Nome: "+this.nome);
    }

    public Usuario(String nome) {
        this.setNome(nome);
    }
    public Usuario(int id,String nome) {
        this(nome);
        this.setId(id);
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
