package br.ufsm.guilherme.model.dao;

import br.ufsm.guilherme.connection.ConnectionFactory;
import br.ufsm.guilherme.model.bean.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO1 {
    
    public void create(Produto produto) {
        
        Connection connection = ConnectionFactory.getConnection();
        Statement stmt = null;
        
        try {
            String sql1 = "INSERT INTO produto(descricao, quantidade, preco) VALUES ('teste1', 15, 5,55)";
            String sql2 = "INSERT INTO produto(descricao, quantidade, preco) VALUES ('teste2', 25, 5,55)";
            String sql3 = "INSERT INTO produto(descricao, quantidade, preco) VALUES ('teste3', 35, 5,55)";
            
            stmt = connection.createStatement();
            
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch(SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(ProdutoDAO1.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
}
