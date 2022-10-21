package br.ufsm.guilherme.controller;

import br.ufsm.guilherme.model.bean.Usuario;
import br.ufsm.guilherme.model.dao.UsuarioDAO;

public class UsuarioController {
    
    public boolean create(String usuario, String senha) {
        return new UsuarioDAO().create(new Usuario(usuario, senha));
    }
    
    public boolean verificaLogin(String usuario, String senha) {
        return new UsuarioDAO().verificaLogin(new Usuario(usuario, senha));
    }
}
