package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Filme;
import utils.JDBCUtils;

public class FilmeDao {

    private JDBCUtils jdbc = new JDBCUtils();
    private Connection con;
    private PreparedStatement stm;
    private ResultSet rs;
    private List<Filme> filmes = new ArrayList<>();

    public void inserir(Filme filme) throws SQLException {

        con = jdbc.getConnection();
        String sql = "INSERT INTO filme (titulo, genero, informacao, disponivel, quantidade, valor) VALUES (?,?,?,?,?,?)";
        stm = con.prepareStatement(sql);
        stm.setString(1, filme.getTitulo());
        stm.setString(2, filme.getGenero());
        stm.setString(3, filme.getInformacao());
        stm.setString(4, filme.getDisponivel());
        stm.setInt(5, filme.getQuantidade());
        stm.setDouble(6, filme.getValor());
        stm.execute();
        con.close();

    }

    public List<Filme> listar() throws SQLException {
        con = jdbc.getConnection();
        String sql = "SELECT * FROM filme";
        stm = con.prepareStatement(sql);
        rs = stm.executeQuery();

        while (rs.next()) {
            Filme filme = new Filme();
            filme.setId(rs.getInt("id"));
            filme.setTitulo(rs.getString("titulo"));
            filme.setGenero(rs.getString("genero"));
            filme.setInformacao(rs.getString("informacao"));
            filme.setDisponivel(rs.getString("disponivel"));
            filme.setQuantidade(rs.getInt("quantidade"));
            filme.setValor(rs.getDouble("valor"));

            filmes.add(filme);
        }
        con.close();
        return filmes;
    }

    public void editar(Filme filme) throws SQLException {

        con = jdbc.getConnection();
        String sql = "UPDATE filme SET titulo = ?, genero = ?, informacao = ?, disponivel = ?, quantidade = ?, valor = ?  WHERE id = ?";
        stm = con.prepareStatement(sql);
        stm.setString(1, filme.getTitulo());
        stm.setString(2, filme.getGenero());
        stm.setString(3, filme.getInformacao());
        stm.setString(4, filme.getDisponivel());
        stm.setInt(5, filme.getQuantidade());
        stm.setDouble(6, filme.getValor());
        stm.setInt(7, filme.getId());
        stm.execute();
        con.close();

    }

    public void excluir(Filme filme) throws SQLException {

        con = jdbc.getConnection();
        String sql = "DELETE FROM filme WHERE id = ?";
        stm = con.prepareStatement(sql);
        stm.setInt(1, filme.getId());
        stm.execute();
        con.close();

    }

}
