package br.ufsm.guilherme.model.bean;

public class Usuario {
    
    private Integer id_usuario;
    private String usuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(Integer id_usuario, String usuario, String senha) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
