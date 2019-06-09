package tests;

import dao.FilmeDao;
import java.sql.SQLException;
import model.Filme;
import utils.Mensagens;

public class TesteEditarFilme {

    public static void main(String[] args) {
        Filme filme = new Filme(1, "Deus não estar morto 2", "Religioso", "Melhor filme religioso de 2017", 1, 2, 28.5);
        FilmeDao dao = new FilmeDao();

        try {
            dao.editar(filme);
            Mensagens.mensagemAviso("Editado com sucesso!");
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }
    }

}
