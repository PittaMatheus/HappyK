package br.com.happykids.dominios;

import java.util.Date;

public class EntidadeDominio {
	
	public Integer id;
	public Date registro;
	public String acao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getRegistro() {
		return registro;
	}
	public void setRegistro(Date registro) {
		this.registro = registro;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}
