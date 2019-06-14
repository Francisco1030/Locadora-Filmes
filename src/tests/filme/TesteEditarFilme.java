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
            Filme f = lista.get(0);
            f.setQuantidade(0);
            f.filmeDisponivel();
            dao.editar(f);
            Mensagens.mensagemConfirmacao("Atualizado");
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }

    }

}
