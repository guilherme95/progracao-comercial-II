package br.ufsm.guilherme.model.dao;

import br.ufsm.guilherme.connection.ConnectionFactory;
import br.ufsm.guilherme.model.bean.Usuario;
import java.io.UnsupportedEncodingException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public boolean create(Usuario usuario) {
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(usuario.getSenha().getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02X", 0xFF & b));
            }
            
            String senhaHex = sb.toString();
            
            stmt = connection.prepareStatement("INSERT INTO usuario(usuario, senha) VALUES (? ,?)");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, senhaHex);
            
            stmt.executeUpdate();
            
            return true;
            
        }catch(SQLException ex) {   
            System.out.println("Erro ao tentar salvar um usuário!");
            return false;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(usuario.getSenha().getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02X", 0xFF & b));
            }
            
            String senhaHex = sb.toString();
            
            stmt = connection.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND senha = ?");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, senhaHex);
            
            rs = stmt.executeQuery();
            
            while(rs.next())
                existsUsuario = true;
            
            
        }catch(SQLException ex) {
            
            System.out.println("Houve um erro ao tentar realizar o login no sistema!");
        
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(connection, stmt);
        }
        
        return existsUsuario;
    }
}
