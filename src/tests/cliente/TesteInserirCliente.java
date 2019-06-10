package tests.cliente;

import dao.ClienteDao;
import java.sql.SQLException;
import model.Cliente;
import model.Endereco;
import utils.Mensagens;

public class TesteInserirCliente {

    public static void main(String[] args) {

        try {

            Endereco e = new Endereco();
            e.setRua("Av Baião");
            e.setNumero("20");
            e.setComplemento("Casa");
            e.setCidade("Quixadá");
            e.setEstado("CE");
            e.setCep("63900-069");

            Cliente c = new Cliente();
            c.setNome("Francisco");
            c.setCpf("058.874.699-77");
            c.setEndereco(e);
            c.setTelefone("(88) 98140-6086");

            ClienteDao dao = new ClienteDao();
            dao.inserir(c);
            Mensagens.mensagemConfirmacao("Cadastrado");
        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }

    }
}
