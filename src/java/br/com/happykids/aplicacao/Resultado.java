package br.com.happykids.aplicacao;

import br.com.happykids.dominios.EntidadeDominio;
import java.util.List;

public class Resultado{
	private String mensagem = null;
	private boolean status;
	private String acao;	
	
	private List<EntidadeDominio> entidade;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public List<EntidadeDominio> getEntidade() {
		return entidade;
	}
	public void setEntidade(List<EntidadeDominio> entidade) {
		this.entidade = entidade;
	}
	
}
