package tests.locacao;

import dao.ClienteDao;
import dao.FilmeDao;
import dao.LocacaoDao;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;
import model.Filme;
import model.Locacao;
import utils.Mensagens;

public class TesteExcluirLocacao {

    public static void main(String[] args) {

        FilmeDao daoF = new FilmeDao();
        ClienteDao daoC = new ClienteDao();
        LocacaoDao daoL = new LocacaoDao();

        try {
            List<Cliente> listaC = daoC.listar();
            List<Filme> listaF = daoF.listar();
            List<Locacao> listaL = daoL.listar();
            
            Locacao lo = listaL.get(0);
            daoL.excluir(lo);

            Mensagens.mensagemConfirmacao("Deletado");

        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
        }

    }

}
