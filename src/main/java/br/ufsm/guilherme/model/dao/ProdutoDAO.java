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

public class ProdutoDAO {
    
    public boolean create(Produto produto) {
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = connection.prepareStatement("INSERT INTO produto(descricao, quantidade, preco, id_categoria) VALUES (?, ?, ?, ?)");
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getCategoria().getIdCategoria());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch(SQLException ex) {
        
            System.out.println("Erro ao tentar salvar produto. Erro: " + ex);
            return false;
            
        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public Collection<Produto> read() {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Collection<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement(
                    "SELECT " +
                        "p.id AS id_produto," +
                        "p.descricao AS ds_produto," +
                        "p.quantidade," +
                        "p.preco," +
                        "c.id AS id_categoria," +
                        "c.descricao AS ds_categoria " +
                    "FROM " +
                        "produto p " +
                    "INNER JOIN categoria c ON p.id_categoria = c.id");

            ResultSet resultSet = stmt.executeQuery();

            while(resultSet.next()){
                Produto produto = new Produto();

                produto.setIdProduto(resultSet.getInt("id_produto"));
                produto.setDescricao(resultSet.getString("ds_produto"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produto.setPreco(resultSet.getDouble("preco"));

                Categoria categoria = new Categoria();
                categoria.setIdCategoria(resultSet.getInt("id_categoria"));
                categoria.setDescricao(resultSet.getString("ds_categoria"));
                
                produto.setCategoria(categoria);
                
                produtos.add(produto);
            }

        } catch(SQLException ex) {

            System.out.println("Erro ao tentar listar produtos. Erro: " + ex);

        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
        
        return produtos;
    }

    public boolean update(Produto produto) {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE produto SET descricao = ?, quantidade = ?, preco = ?, id_categoria = ? WHERE id = ?");
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getCategoria().getIdCategoria());
            stmt.setDouble(5, produto.getIdProduto());
            
            stmt.executeUpdate();

            return true;
            
        } catch(SQLException ex) {

            System.out.println("Erro ao salvar produto. Erro: " + ex);
            return false;

        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public boolean delete(Integer id) {

        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setDouble(1, id);

            stmt.executeUpdate();

            return true;
        } catch(SQLException ex) {
            System.out.println("Não foi possível excluir produto. Erro: " + ex);
            return false;
        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }

    }
    
    public Collection<Produto> listarProdutoPorDescricao(String descricao) {
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        
        Collection<Produto> produtos = new ArrayList();
        
        try{
            
            stmt = connection.prepareStatement("SELECT * FROM view_produtocategoria WHERE ds_produto LIKE ? ORDER BY id_produto");
            stmt.setString(1, "%"+descricao+"%");
            resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
                Produto produto = new Produto();

                produto.setIdProduto(resultSet.getInt("id_produto"));
                produto.setDescricao(resultSet.getString("ds_produto"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produto.setPreco(resultSet.getDouble("preco"));

                Categoria categoria = new Categoria();
                categoria.setIdCategoria(resultSet.getInt("id_categoria"));
                categoria.setDescricao(resultSet.getString("ds_categoria"));
                
                produto.setCategoria(categoria);
                
                produtos.add(produto);
            }
            
        }catch(SQLException ex) {
            System.out.println("Não foi possível realizar a busca por produto");
        }finally{
            ConnectionFactory.closeConnection(connection, stmt, resultSet);
        }
        
        return produtos;
    }
    
    public Collection<Produto> listarCategoriaPorDescricao(String descricao) {
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        
        Collection<Produto> produtos = new ArrayList();
        
        try{
            
            stmt = connection.prepareStatement("SELECT * FROM view_produtocategoria WHERE ds_categoria LIKE ? ORDER BY id_categoria");
            stmt.setString(1, descricao);
            resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
                Produto produto = new Produto();

                produto.setIdProduto(resultSet.getInt("id_produto"));
                produto.setDescricao(resultSet.getString("ds_produto"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produto.setPreco(resultSet.getDouble("preco"));

                Categoria categoria = new Categoria();
                categoria.setIdCategoria(resultSet.getInt("id_categoria"));
                categoria.setDescricao(resultSet.getString("ds_categoria"));
                
                produto.setCategoria(categoria);
                
                produtos.add(produto);
            }
            
        }catch(SQLException ex) {
            System.out.println("Não foi possível realizar a busca por categoria");
        }finally{
            ConnectionFactory.closeConnection(connection, stmt, resultSet);
        }
        
        return produtos;
    }
}
