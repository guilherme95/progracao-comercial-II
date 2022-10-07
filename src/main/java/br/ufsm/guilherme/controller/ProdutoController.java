package br.ufsm.guilherme.controller;

import br.ufsm.guilherme.model.bean.Produto;
import br.ufsm.guilherme.model.dao.ProdutoDAO;

import java.util.Collection;

public class ProdutoController {
    
    public void create(String descricao, Integer quantidade, Double preco){
        
        Produto produto = new Produto();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        
        produtoDAO.create(produto);
    }

    public Collection<Produto> read() {
        return new ProdutoDAO().read();
    }

    public void update(Integer id, String descricao, Integer quantidade, Double preco){

        Produto produto = new Produto();
        ProdutoDAO produtoDAO = new ProdutoDAO();

        produto.setIdProduto(id);
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);

        produtoDAO.update(produto);
    }

    public void delete(Integer id) {
        new ProdutoDAO().delete(id);
    }
}
