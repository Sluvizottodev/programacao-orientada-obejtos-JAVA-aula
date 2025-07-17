import java.sql.ResultSet;
import java.sql.SQLException;

public List<Usuario> listarTodos(){
    
    // 1- Criar a lista p/ armazenar dados
    List<Usuario> lista = new ArrayList<>();

    // 2- Definirconsulta sql
    String sql =  "SELECT * FROM usuaruio ORDER BY nome";
    
    try {
        // 3- preparar a consulta 
        stmt = con.prepareStatement(sql);

        // executar a consulta e retorna os dados
        ResultSet rs = stmt.executeQuery();

        // cria o objeto Usuario e preenche com os dados
        while(rs.next()){// percorre cada lina do resultado
            Usuario u = new Usuario();
            u.setId(rs.getInt("id"));
            u.setNome(rs.getString("nome"));
            lista.add(u);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return lista;
}
