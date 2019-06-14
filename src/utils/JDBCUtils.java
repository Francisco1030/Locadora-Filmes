package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

    public Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/locadora", "root", "");
//            Mensagens.mensagemConfirmacao("Conectado");
            return con;

        } catch (SQLException e) {
            Mensagens.mensagemErro(e.getMessage());
            return null;
        } finally {
//      System.out.println("SEMPRE VAI EXECUTAR");
        }
    }
}
