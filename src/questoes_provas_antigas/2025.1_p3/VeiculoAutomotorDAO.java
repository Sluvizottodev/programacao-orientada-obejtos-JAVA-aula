package src.questoes_provas_antigas._2025_1_p3;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import src.questoes_provas_antigas._2025_1_p3.VeiculoAutomotor;

// Custom exception for domain-specific errors
class DominioException extends Exception {
    public DominioException(String message) {
        super(message);
    }
}

public class VeiculoAutomotorDAO {
    private String sql = null;
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    public VeiculoAutomotorDAO (Connection con){
        this.con = con;
    }

    public int inserir (VeiculoAutomotor va) throws DominioException{
        int linhasAfetadas = 0;
        this.sql = "INSERT INTO veiculo_automotor(modelo, ano, valor_de_mercado) VALUES (?,?,?)";
        try{
            this.stmt = con.prepareStatement(this.sql);
            this.stmt.setString(1, va.getModelo());
            this.stmt.setInt(2, va.getAno());
            this.stmt.setDouble(3, va.getValorDeMercado());
            linhasAfetadas = this.stmt.executeUpdate();
        }catch(SQLException e){
            throw new DominioException("Erro ao inserir veículo. " + e.getMessage());   
        }
        return linhasAfetadas;
    }

    public List<VeiculoAutomotor> obterTodos() throws DominioException{
        List<VeiculoAutomotor> veiculos = new ArrayList<>();
        this.sql = "SELECT * FROM veiculo_automotor";
        try{
            this.stmt = con.prepareStatement(this.sql);
            this.rs = this.stmt.executeQuery();
            while(rs.next()){
                VeiculoAutomotor va = new VeiculoAutomotor(
                    rs.getString("modelo"), rs.getInt("ano"), rs.getDouble("valor_de_mercado")
                );
                va.setId(rs.getInt("id"));
                veiculos.add(va);
            }
        }catch (SQLException e){
            throw new DominioException("Erro ao listar todos." + e.getMessage());
        }
        return veiculos;
    }
}