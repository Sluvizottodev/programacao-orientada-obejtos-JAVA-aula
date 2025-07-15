package explicacoes.padroes_de_projeto.DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestaInsereDAO {
    public static void main (String[] args) {

        Contato contato= new Contato ();
        contato.setNome ("Fulano") ;
        contato.setEmail("fulano@ffsd.br");
        contato.setEndereco ("Rua Piaui, 25");

        Calendar dataNascimento = Calendar.getInstance();
        try {
            java.util.Date data = new SimpleDateFormat ("dd/MM/yyyy") .parse("05/10/1992");
            dataNascimento.setTime (data);
            contato.setDataNascimento (dataNascimento);
        } catch (ParseException e) {
            System. out.println ("Erro ao converter data");
            //Instanciando um dao
            ContatoDAO dao = new ContatoDAO();
            //Adicionar o contato ao banco de dados
            dao.adiciona (contato);
        }
    }
}
