package br.com.happykids.dominios;

public class Telefone extends EntidadeDominio{
	public String tipoTelefone;
	public String ddd;
	public String numero;	
	
	public Telefone(String tipoTelefone, String ddd, String numero) {
		super();
		this.tipoTelefone = tipoTelefone;
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public Telefone() {
		
	}
	
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
