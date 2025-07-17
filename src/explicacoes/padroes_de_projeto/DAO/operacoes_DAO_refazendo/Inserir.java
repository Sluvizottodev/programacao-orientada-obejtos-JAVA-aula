@Override
public Usuario inserir(Usuario u) throws DominioException {
    // define o comando SQL para inserir apenas o nome do usuário
    this.sql = "INSERT INTO usuario(nome) VALUES(?)";

    try {
        // prepara o comando para retornar a chave gerada (id)
        this.stmt = this.con.prepareStatement(this.sql, Statement.RETURN_GENERATED_KEYS);

        // define o valor do nome no primeiro parâmetro do SQL
        this.stmt.setString(1, u.getNome());

        // executa o comando SQL
        this.stmt.execute();

        // recupera o id gerado automaticamente pelo banco
        this.rs = stmt.getGeneratedKeys();
        if (this.rs.next()) {
            int id = this.rs.getInt(1);
            u.setId(id); // define o id no objeto usuario
        }

    } catch (SQLException e) {
        // encapsula e lança uma exceção de domínio
        throw new DominioException("Erro ao inserir usuário: " + e.getMessage());
    }

    return u; // retorna o objeto com o id atualizado
}
