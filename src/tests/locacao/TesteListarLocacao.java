
package tests.locacao;

import dao.LocacaoDao;
import java.sql.SQLException;
import java.util.List;
import model.Locacao;
import utils.Mensagens;

public class TesteListarLocacao {
    public static void main(String[] args) {

        LocacaoDao dao = new LocacaoDao();

        try {
            List<Locacao> lista = dao.listar();

            for (Locacao locacao : lista) {
//                Mensagens.mensagemConfirmacao(filmes);
                System.out.println(locacao);
            }
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }

    }
    
}
