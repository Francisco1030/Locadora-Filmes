package tests.filme;

import dao.FilmeDao;
import java.sql.SQLException;
import java.util.List;
import model.Filme;
import utils.Mensagens;

public class TesteExcluirFilme {

    public static void main(String[] args) {
        FilmeDao dao = new FilmeDao();

        try {
            List<Filme> lista = dao.listar();
            Filme c4 = lista.get(1);
            dao.excluir(c4);
            Mensagens.mensagemConfirmacao("Deletado");
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }
    }
}
