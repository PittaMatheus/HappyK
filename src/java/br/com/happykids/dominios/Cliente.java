package br.com.happykids.dominios;

import java.util.Date;

public class Cliente extends EntidadeDominio {

    public String genero;
    public String ranking;
    public String nome;
    public String cpf;
    public String dataNascimento;
    public Integer ddd;
    public Telefone telefone;
    public String email;
    public Endereco endereco;
    public Usuario usuario;

    public Cliente(String genero,String ranking, String nome, String cpf, String dataNascimento, Integer ddd, Telefone telefone, String email,
            Endereco endereco, Usuario usuario) {
        super();
        this.genero = genero;
        this.ranking = ranking;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.ddd = ddd;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public Cliente() {
        endereco = new Endereco();
        usuario = new Usuario();
        telefone = new Telefone();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRanking(){
        return ranking;
    }
    
    public void setRanking(String ranking){
        this.ranking = ranking;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
