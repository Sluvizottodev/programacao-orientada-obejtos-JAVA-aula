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
            this.stmt = con.PreparedStatement(this.sql);
            this.stmt.setString(1, va.getModelo());
            this.stmt.setInt(2, va.getAno());
            this.stmt.setDouble(3, va.getValorDeMercado());
            linhasAfetadas = this.stmt.executeUpdate();
        }catch(SQLException e){
            throw new DominioException("Erro ao inserir veículo. " + e.getMessage());   
        }
        return linhasAfetadas;
    }
}