package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Filme;
import utils.JDBCUtils;

public class FilmeDao {

    private JDBCUtils jdbc = new JDBCUtils();

    public void inserir(Filme filme) throws SQLException {

        Connection con = jdbc.getConnection();
        String sql = "INSERT INTO filme (titulo, genero, informacao, disponivel, quantidade, valor) VALUES (?,?,?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, filme.getTitulo());
        stm.setString(2, filme.getGenero());
        stm.setString(3, filme.getInformacao());
        stm.setInt(4, filme.getDisponivel());
        stm.setInt(5, filme.getQuantidade());
        stm.setDouble(6, filme.getValor());
        stm.execute();
        con.close();

    }

    public void editar(Filme filme) throws SQLException {
        Connection con = jdbc.getConnection();
        String sql = "UPDATE filme SET titulo = ?, genero = ?, informacao = ?, disponivel = ?, quantidade = ?, valor = ?  WHERE id = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, filme.getTitulo());
        stm.setString(2, filme.getGenero());
        stm.setString(3, filme.getInformacao());
        stm.setInt(4, filme.getDisponivel());
        stm.setInt(5, filme.getQuantidade());
        stm.setDouble(6, filme.getValor());
        stm.setInt(7, filme.getId());
        stm.execute();
        con.close();
    }

}
