package br.ufsm.guilherme.controller;

import br.ufsm.guilherme.model.bean.Categoria;
import br.ufsm.guilherme.model.bean.Produto;
import br.ufsm.guilherme.model.dao.ProdutoDAO;

import java.util.Collection;

public class ProdutoController {
    
    public boolean create(String descricao, Integer quantidade, Double preco, Categoria categoria){
        
        Produto produto = new Produto();
        
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        produto.setCategoria(categoria);
        
        return new ProdutoDAO().create(produto);
    }

    public Collection<Produto> read() {
        return new ProdutoDAO().read();
    }

    public boolean update(Integer id, String descricao, Integer quantidade, Double preco, Categoria categoria){

        Produto produto = new Produto();

        produto.setIdProduto(id);
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        produto.setCategoria(categoria);
        
        return new ProdutoDAO().update(produto);
    }

    public boolean delete(Integer id) {
        return new ProdutoDAO().delete(id);
    }
    
    public Collection<Produto> listarProdutoPorDescricao(String descricao) {
        return new ProdutoDAO().listarProdutoPorDescricao(descricao);
    }
    
    public Collection<Produto> listarCategoriaPorDescricao(String descricao) {
        return new ProdutoDAO().listarCategoriaPorDescricao(descricao);
    }
}
