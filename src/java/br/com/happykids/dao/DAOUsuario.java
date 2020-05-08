/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.happykids.dao;

import br.com.happykids.aplicacao.Resultado;
import br.com.happykids.core.AbstractDAO;
import br.com.happykids.dominios.EntidadeDominio;
import br.com.happykids.dominios.Usuario;
import br.com.happykids.utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victoria Hirata
 */
public class DAOUsuario extends AbstractDAO {
    	@Override
	public Resultado inserir(EntidadeDominio entidade) {
		try {
			Connection conexao = Conexao.getConexao();
			Usuario usuario = (Usuario) entidade;
			List<EntidadeDominio> entidades = new ArrayList<EntidadeDominio>();
			PreparedStatement ps = conexao.prepareStatement("INSERT INTO tb_usuario(email,password) values ('email',?)" , Statement.RETURN_GENERATED_KEYS);
			
//                        ps.setString(1, usuario.getEmail());
			ps.setString(1, usuario.getSenha());
			ps.execute();
			
			ResultSet rs = ps.getGeneratedKeys();
			
			usuario.setId(rs.next()?rs.getInt(1):0);
			entidades.add(usuario);
                        resultado.setEntidade(entidades);
			resultado.setStatus(true);
			resultado.setMensagem("Cliente cadastrado com sucesso!");
			
			conexao.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			resultado.setStatus(false);
			resultado.setMensagem("A classe não foi encontrada.");
		}
		catch(SQLException sqlExecption) {
			sqlExecption.printStackTrace();
			resultado.setStatus(false);
			resultado.setMensagem("Erro ao cadastrar o cliente no banco de dados");
		}
		return resultado;
	}
}
