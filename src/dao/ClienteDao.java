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
        String sql = "INSERT INTO cliente (nome, cpf, rua, numero, complemento, cidade, estado, cep, telefone) VALUES (?,?,?,?,?,?,?,?,?)";
        stm = con.prepareStatement(sql);
        stm.setString(1, cliente.getNome());
        stm.setString(2, cliente.getCpf());
        stm.setString(3, cliente.getEndereco().getRua());
        stm.setString(4, cliente.getEndereco().getNumero());
        stm.setString(5, cliente.getEndereco().getComplemento());
        stm.setString(6, cliente.getEndereco().getCidade());
        stm.setString(7, cliente.getEndereco().getEstado());
        stm.setString(8, cliente.getEndereco().getCep());
        stm.setString(9, cliente.getTelefone());
        stm.execute();
        con.close();

    }
}
