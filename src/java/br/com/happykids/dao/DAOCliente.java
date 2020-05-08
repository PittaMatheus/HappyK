package br.com.happykids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.happykids.aplicacao.Resultado;
import br.com.happykids.core.AbstractDAO;
import br.com.happykids.dominios.Cliente;
import br.com.happykids.dominios.EntidadeDominio;
import br.com.happykids.utils.Conexao;

public class DAOCliente extends AbstractDAO {

	@Override
	public Resultado inserir(EntidadeDominio entidade) {
		try {
			Connection conexao = Conexao.getConexao();
			Cliente cliente = (Cliente) entidade;
                        DAOUsuario daoUsuario = new DAOUsuario();
                        resultado = daoUsuario.inserir(cliente.usuario);
			PreparedStatement ps = conexao.prepareStatement(
                                "INSERT INTO tb_cliente(nome,data_nascimento,cpf,ranking,id_usuario, id_genero, id_endereco,id_contato,id_cartao,id_status)"
					+ "values (?,?,?,'50',?,1,1,1,1,1)" , Statement.RETURN_GENERATED_KEYS);
			
                        ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getDataNascimento());
			ps.setString(3, cliente.getCpf());
                        ps.setInt(4, resultado.getEntidade().get(0).getId());
			ps.execute();
			
			ResultSet rs = ps.getGeneratedKeys();
			
			cliente.setId(rs.next()?rs.getInt(1):0);
                        System.out.println("Cheguei até aqui");
			resultado.setStatus(true);
                        
			resultado.setMensagem("Cliente cadastrado com sucesso!");
			
			conexao.close();
			
		}catch(ClassNotFoundException e) {
			resultado.setStatus(false);
			resultado.setMensagem("A classe não foi encontrada.");
		}
		catch(SQLException sqlExecption) {
                        sqlExecption.printStackTrace();   
			resultado.setStatus(false);
			resultado.setMensagem("Erro ao cadastrar o cliente no banco de dados");
		}
                System.err.println("resultado: " + resultado);
		return resultado;
	}
	
}
