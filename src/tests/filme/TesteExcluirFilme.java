package tests.filme;

import dao.FilmeDao;
import java.sql.SQLException;
import model.Filme;
import utils.Mensagens;

public class TesteExcluirFilme {
    
    public static void main(String[] args) {
        Filme filme = new Filme();
        FilmeDao dao = new FilmeDao();
        filme.setId(1);
        
        try{
              dao.excluir(filme);
              Mensagens.mensagemAviso("Excluido");
        }catch(SQLException e){
            Mensagens.mensagemErro(e.getMessage());
        }
        
    }
}
