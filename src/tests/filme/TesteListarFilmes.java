package tests.filme;

import dao.FilmeDao;
import java.sql.SQLException;
import java.util.List;
import model.Filme;
import utils.Mensagens;

public class TesteListarFilmes {
    
    public static void main(String[] args) {
        FilmeDao dao = new FilmeDao();
        
        try {
            List<Filme> lista = dao.listar();
            
            for(Filme filmes : lista){
//                Mensagens.mensagemConfirmacao(filmes);
                System.out.println(filmes);
            }
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }
        
    }
}
