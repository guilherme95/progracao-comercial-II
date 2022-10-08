package br.ufsm.guilherme.model.dao;

import br.ufsm.guilherme.connection.ConnectionFactory;
import br.ufsm.guilherme.model.bean.Categoria;
import br.ufsm.guilherme.model.bean.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CategoriaDAO {
  
    public void create(Categoria categoria) {
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = connection.prepareStatement("INSERT INTO categoria(descricao) VALUES (?)");
            stmt.setString(1, categoria.getDescricao());
                        
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch(SQLException ex) {
        
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public Collection<Categoria> read() {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Collection<Categoria> categorias = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM categoria ORDER BY descricao ASC");

            ResultSet resultSet = stmt.executeQuery();

            while(resultSet.next()){
                Categoria categoria = new Categoria();

                categoria.setIdCategoria(resultSet.getInt("id"));
                categoria.setDescricao(resultSet.getString("descricao"));
                
                categorias.add(categoria);
            }

        } catch(SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao tentar ler categorias: " + ex);
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
        return categorias;
    }

    public void update(Categoria categoria) {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE categoria SET descricao = ? WHERE id = ?");
            stmt.setString(1, categoria.getDescricao());
            stmt.setDouble(2, categoria.getIdCategoria());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Categoria atualizado com sucesso");

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
            stmt = connection.prepareStatement("DELETE FROM categoria WHERE id = ?");
            stmt.setDouble(1, id);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Categoria excluído com sucesso");

        } catch(SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }

    }
    
}
