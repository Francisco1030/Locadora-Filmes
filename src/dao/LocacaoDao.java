package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Filme;
import model.Locacao;
import utils.JDBCUtils;

public class LocacaoDao {

    private JDBCUtils jdbc = new JDBCUtils();
    private Connection con;
    private PreparedStatement stm;
    private ResultSet rs;
    private List<Locacao> locacoes = new ArrayList<>();

    public void inserir(Locacao locacao) throws SQLException {

        con = jdbc.getConnection();
        String sql = "INSERT INTO locacao (id_cliente, id_filme, data_locacao, data_devolucao, status) VALUES (?,?,?,?,?)";
        stm = con.prepareStatement(sql);
        stm.setInt(1, locacao.getCliente().getId());
        stm.setInt(2, locacao.getFilme().getId());
        stm.setDate(3, (java.sql.Date) locacao.getDataLocacao());
        stm.setDate(4, (java.sql.Date) locacao.getDataDevolucao());
        stm.setString(5, locacao.getStatus());
        stm.execute();
        con.close();

    }
    
    public List<Locacao> listar() throws SQLException {
        con = jdbc.getConnection();
        String sql = "SELECT * FROM locadora.locacao as l natural join locadora.cliente as c join locadora.filme as f";
        stm = con.prepareStatement(sql);
        rs = stm.executeQuery();

        while (rs.next()) {
            Locacao locacao = new Locacao();

            locacao.setId(rs.getInt("id"));
            locacao.setDataLocacao(rs.getDate("data_locacao"));
            locacao.setDataDevolucao(rs.getDate("data_devolucao"));

            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.getEndereco().setRua(rs.getString("rua"));
            cliente.getEndereco().setNumero(rs.getString("numero"));
            cliente.getEndereco().setCidade(rs.getString("cidade"));
            cliente.setTelefone(rs.getString("telefone"));

            Filme filme = new Filme();
            filme.setId(rs.getInt("id"));
            filme.setTitulo(rs.getString("titulo"));
            filme.setGenero(rs.getString("genero"));
            filme.setInformacao(rs.getString("informacao"));
            filme.setDisponivel(rs.getString("disponivel"));
            filme.setQuantidade(rs.getInt("quantidade"));
            filme.setValor(rs.getDouble("valor"));

            locacao.setCliente(cliente);
            locacao.setFilme(filme);

            locacoes.add(locacao);

        }
        con.close();
        return locacoes;
    }

    public void editar(Locacao locacao) throws SQLException {

        con = jdbc.getConnection();
        String sql = "UPDATE locacao SET id_cliente = ?, id_filme = ?, data_locacao = ?, data_devolucao = ?, status = ?  WHERE id = ?";
        stm = con.prepareStatement(sql);
        stm.setInt(1, locacao.getCliente().getId());
        stm.setInt(2, locacao.getFilme().getId());
        stm.setDate(3, (java.sql.Date) locacao.getDataLocacao());
        stm.setDate(4, (java.sql.Date) locacao.getDataDevolucao());
        stm.setString(5, locacao.getStatus());
        stm.setInt(6, locacao.getId());
        stm.execute();
        con.close();

    }

    public void excluir(Locacao locacao) throws SQLException {

        con = jdbc.getConnection();
        String sql = "DELETE FROM locacao WHERE id = ?";
        stm = con.prepareStatement(sql);
        stm.setInt(1, locacao.getId());
        stm.execute();
        con.close();

    }
}
