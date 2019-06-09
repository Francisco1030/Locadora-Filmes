package tests.filme;

import dao.FilmeDao;
import java.sql.SQLException;
import model.Filme;
import utils.Mensagens;

public class TesteExcluirFilme {

    public static void main(String[] args) {
        Filme filme = new Filme();
        FilmeDao dao = new FilmeDao();
        filme.setId(4);

        try {
            int v = Mensagens.mensagemApagar("Deseja apagar o filme? ");
            if (v == 0) {
                dao.excluir(filme);
                Mensagens.mensagemAviso("Excluido");
            }

        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }

    }
}
