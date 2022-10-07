package br.ufsm.guilherme.model.dao;

import br.ufsm.guilherme.connection.ConnectionFactory;
import br.ufsm.guilherme.model.bean.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    public void create(Produto produto) {
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = connection.prepareStatement("INSERT INTO produto(descricao, quantidade, preco) VALUES (?, ?, ?)");
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch(SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public Collection<Produto> read() {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Collection<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM produto ORDER BY descricao ASC");

            ResultSet resultSet = stmt.executeQuery();

            while(resultSet.next()){
                Produto produto = new Produto();

                produto.setIdProduto(resultSet.getInt("id"));
                produto.setDescricao(resultSet.getString("descricao"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produto.setPreco(resultSet.getDouble("preco"));

                produtos.add(produto);
            }

        } catch(SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
        return produtos;
    }

    public void update(Produto produto) {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE produto SET descricao = ?, quantidade = ?, preco = ? WHERE id = ?");
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setDouble(4, produto.getIdProduto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");

        } catch(SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public void delete(Integer id) {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setDouble(1, id);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");

        } catch(SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }

    }
}
