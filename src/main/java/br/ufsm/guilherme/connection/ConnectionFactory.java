package br.ufsm.guilherme.connection;

import java.sql.*;

public class ConnectionFactory {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/dbguilherme";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";


    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão do banco de dados: " + ex);
        }
    }

    public static void closeConnection(Connection connection) {
        if (connection!=null){
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement stmt) {
        if (stmt!=null){
            try {
                stmt.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        closeConnection(connection);
    }

    public static void closeConnection(Connection connection, PreparedStatement stmt, ResultSet rs) {
        if (rs!=null){
            try {
                rs.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        closeConnection(connection, stmt);
    }

}
