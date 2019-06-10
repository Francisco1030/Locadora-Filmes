package tests.cliente;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;
import utils.Mensagens;

public class TesteExcluirCliente {

    public static void main(String[] args) {

        ClienteDao dao = new ClienteDao();

        try {
            List<Cliente> lista = dao.listar();
            Cliente c4 = lista.get(1);
            dao.excluir(c4);
            Mensagens.mensagemConfirmacao("Deletado");
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }
    }
}
