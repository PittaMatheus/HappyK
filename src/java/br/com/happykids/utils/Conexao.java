package br.com.happykids.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        // Define um driver de conexao com o banco.
        Class.forName("org.postgresql.Driver");
        // Abre uma conexao com o banco.
        Connection conexao;
        return DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/happyKids","postgres","root");
    }

}
