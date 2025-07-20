public class VeiculoAutomotorDAO {
    private String sql = null;
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    public VeiculoAutomotorDAO (Connection con){
        this.con = con;
    }
}