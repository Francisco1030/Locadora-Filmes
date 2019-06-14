package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import utils.JDBCUtils;

public class ClienteDao {

    private JDBCUtils jdbc = new JDBCUtils();
    private Connection con;
    private PreparedStatement stm;
    private ResultSet rs;
    private List<Cliente> clientes = new ArrayList<>();

    public void inserir(Cliente cliente) throws SQLException {

        con = jdbc.getConnection();
        String sql = "INSERT INTO cliente (nome, cpf, rua, numero, cidade, telefone) VALUES (?,?,?,?,?,?)";
        stm = con.prepareStatement(sql);
        stm.setString(1, cliente.getNome());
        stm.setString(2, cliente.getCpf());
        stm.setString(3, cliente.getEndereco().getRua());
        stm.setString(4, cliente.getEndereco().getNumero());
        stm.setString(5, cliente.getEndereco().getCidade());
        stm.setString(6, cliente.getTelefone());
        stm.execute();
        con.close();

    }

    public List<Cliente> listar() throws SQLException {
        con = jdbc.getConnection();
        String sql = "SELECT * FROM cliente";
        stm = con.prepareStatement(sql);
        rs = stm.executeQuery();

        while (rs.next()) {
            Cliente cliente = new Cliente();

            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.getEndereco().setRua(rs.getString("rua"));
            cliente.getEndereco().setNumero(rs.getString("numero"));
            cliente.getEndereco().setCidade(rs.getString("cidade"));
            cliente.setTelefone(rs.getString("telefone"));
            clientes.add(cliente);

        }
        con.close();
        return clientes;
    }

    public void editar(Cliente cliente) throws SQLException {

        con = jdbc.getConnection();
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, rua = ?, numero = ?, cidade = ?, telefone = ?  WHERE id = ?";
        stm = con.prepareStatement(sql);
        stm.setString(1, cliente.getNome());
        stm.setString(2, cliente.getCpf());
        stm.setString(3, cliente.getEndereco().getRua());
        stm.setString(4, cliente.getEndereco().getNumero());
        stm.setString(5, cliente.getEndereco().getCidade());
        stm.setString(6, cliente.getTelefone());
        stm.setInt(7, cliente.getId());
        stm.execute();
        con.close();

    }

    public void excluir(Cliente cliente) throws SQLException {

        con = jdbc.getConnection();
        String sql = "DELETE FROM cliente WHERE id = ?";
        stm = con.prepareStatement(sql);
        stm.setInt(1, cliente.getId());
        stm.execute();
        con.close();

    }
}
