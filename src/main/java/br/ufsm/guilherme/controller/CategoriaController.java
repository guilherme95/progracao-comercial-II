package br.ufsm.guilherme.controller;

import br.ufsm.guilherme.model.bean.Categoria;
import br.ufsm.guilherme.model.bean.Produto;
import br.ufsm.guilherme.model.dao.CategoriaDAO;
import br.ufsm.guilherme.model.dao.ProdutoDAO;

import java.util.Collection;

public class CategoriaController {
    
    public void create(String descricao){
        
        Categoria categoria = new Categoria();
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        categoria.setDescricao(descricao);
        
        categoriaDAO.create(categoria);
    }

    public Collection<Categoria> read() {
        return new CategoriaDAO().read();
    }

    public void update(Integer id, String descricao){

        Categoria categoria = new Categoria();
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        categoria.setIdCategoria(id);
        categoria.setDescricao(descricao);

        categoriaDAO.update(categoria);
    }

    public void delete(Integer id) {
        new CategoriaDAO().delete(id);
    }
}
