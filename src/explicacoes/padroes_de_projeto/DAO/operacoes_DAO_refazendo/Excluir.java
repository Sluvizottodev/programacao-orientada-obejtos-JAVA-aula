@Override
public int excluir(int id) throws DominioException {
    // guarda quantas linhas foram afetadas
    int linhasAfetadas = 0;

    // comando SQL para deletar o usuário pelo id
    this.sql = "DELETE FROM usuario WHERE id = ?";

    try {
        // prepara o comando SQL
        this.stmt = this.con.prepareStatement(sql);

        // define o valor do parâmetro "?" com o id
        this.stmt.setInt(1, id);

        // executa a exclusão e retorna quantas linhas foram afetadas
        linhasAfetadas = this.stmt.executeUpdate();
        
    } catch (SQLException e) {
        // trata erros de SQL e lança exceção personalizada
        throw new DominioException("Erro ao remover usuário. " + e.getMessage());
    }

    // retorna o número de linhas excluídas
    return linhasAfetadas;
}
