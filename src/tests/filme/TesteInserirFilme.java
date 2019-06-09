package tests.filme;

import dao.FilmeDao;
import java.sql.SQLException;
import model.Filme;
import utils.Mensagens;

public class TesteInserirFilme {
    
    public static void main(String[] args) {
        Filme filme = new Filme("Deus não estar morto", "Religioso", "Melhor filme religioso de 2015",  0, 25.5);
        FilmeDao dao = new FilmeDao();
        
//        System.out.println(filme);
        try {
            dao.inserir(filme);
            Mensagens.mensagemAviso("Inserido com sucesso!");
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }
    }
    
}
