package br.ufsm.guilherme.model.dao;

import br.ufsm.guilherme.connection.ConnectionFactory;
import br.ufsm.guilherme.model.bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

public class UsuarioDAO {

    public boolean create(Usuario usuario) {
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            stmt = connection.prepareStatement("INSERT INTO usuario(usuario, senha) VALUES (? ,?)");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, Base64.getEncoder().encodeToString(usuario.getSenha().getBytes()));
            
            stmt.executeUpdate();
            
            return true;
        }catch(SQLException ex) {
            
            System.out.println("Erro ao tentar salvar um usuário!");
            return false;
        }finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
    
    public boolean verificaLogin(Usuario usuario) {
        
        boolean existsUsuario = false;
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = connection.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND senha = ?");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, Base64.getEncoder().encodeToString(usuario.getSenha().getBytes()));
            
            rs = stmt.executeQuery();
            
            while(rs.next())
                existsUsuario = true;
            
            
        }catch(SQLException ex) {
            
            System.out.println("Houve um erro ao tentar realizar o login no sistema!");
        }finally{
            ConnectionFactory.closeConnection(connection, stmt);
        }
        
        return existsUsuario;
    }
}
