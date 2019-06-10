package tests.filme;

import dao.FilmeDao;
import java.sql.SQLException;
import java.util.List;
import model.Filme;
import utils.Mensagens;

public class TesteEditarFilme {

    public static void main(String[] args) {
        FilmeDao dao = new FilmeDao();

        try {
            List<Filme> lista = dao.listar();
            Filme c4 = lista.get(0);
            c4.setQuantidade(18);
            c4.filmeDisponivel();
            dao.editar(c4);
            Mensagens.mensagemConfirmacao("Atualizado");
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }

    }

}
