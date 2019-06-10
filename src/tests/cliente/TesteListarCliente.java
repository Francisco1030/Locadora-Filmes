package tests.cliente;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;
import utils.Mensagens;

public class TesteListarCliente {

    public static void main(String[] args) {

        ClienteDao dao = new ClienteDao();

        try {
            List<Cliente> lista = dao.listar();

            for (Cliente clientes : lista) {
//                Mensagens.mensagemConfirmacao(filmes);
                System.out.println(clientes);
            }
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }

    }
}
