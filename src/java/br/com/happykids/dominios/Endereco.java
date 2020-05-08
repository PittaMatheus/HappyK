package br.com.happykids.dominios;

public class Endereco extends EntidadeDominio {

    public String nome;
    public String logradouro;
    public String numero;
    public String bairro;
    public String cep;
    public String tipoEndereco;
    public String tipoResidencia;
    public String tipoLogradouro;
    public String cidade;
    public String pais;
    public String estado;
    public boolean status;

    public Endereco(String nome, String logradouro, String numero, String bairro, String cep,
            String tipoEndereco, String tipoLogradouro, String cidade, String pais, String estado, boolean status) {
        super();
        this.logradouro = logradouro;
        this.nome = nome;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.tipoEndereco = tipoEndereco;
        this.cidade = cidade;
        this.pais = pais;
        this.estado = estado;
        this.status = status;
    }

    public Endereco() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoResidencia(String tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }

    public String getTipoResidencia() {
        return tipoResidencia;
    }

    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
