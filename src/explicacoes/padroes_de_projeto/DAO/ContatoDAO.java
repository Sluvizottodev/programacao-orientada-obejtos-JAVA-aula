package explicacoes.padroes_de_projeto.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {
    private Connection conexao;
    public ContatoDAO(){
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void adiciona (Contato c){
        PreparedStatement stmt = null;
        try {
            if(conexao.isClosed())
                conexao = new ConnectionFactory().getConexao();
        } catch (SQLException e) {
            System.out.println("Erro ao obter conexão " + e.getMessage());
        }
        //instrução SQL p/ add contato
        this.comandoSQL = "INSERT INTO contatos (nome, email, endereco, dataNascimento) VALUES (?, ?, ?, ?)";

        try {
            this.stmt = this.conexao.prepareStatement(comandoSQL);

            //passando args
            this.stmt.setString(1, c.getNome());
            this.stmt.setString(2, c.getEmail());
            this.stmt.setString(3, c.getEndereco());
            this.stmt.setDate(4, new java.sql.Date(c.getDataNascimento().getTimeInMillis()));
            stmt.execute();
        } catch (SQLException e) {
             System.out.println("Erro ao adicionar " + e.getMessage());
        } finally{
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão " + e.getMessage());
            }
        }
    }
}
