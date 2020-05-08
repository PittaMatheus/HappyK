package br.com.happykids.dominios;

public class Usuario extends EntidadeDominio {
	
	public String senha;
        public String email;
        public Integer id;


	public Usuario(String senha, String email, Integer id) {
		super();
		this.senha = senha;
                this.email = email;
                this.id = id;
	}

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
	
	public Usuario() {

	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
        public String getEmail(){
            return email;
        }
        
        public void setEmail(String email){
            this.email = email;
        }
}
