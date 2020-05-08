package br.com.happykids.viewhelper;

import javax.servlet.http.HttpServletRequest;

import br.com.happykids.dominios.Cliente;
import br.com.happykids.dominios.Endereco;
import br.com.happykids.dominios.EntidadeDominio;
import br.com.happykids.dominios.Telefone;
import br.com.happykids.dominios.Usuario;

public class ViewCliente implements IViewHelper {

    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {

        Telefone telefone = new Telefone();
        Endereco endereco = new Endereco();
        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();

        try {
            String id = request.getParameter("id");
            System.err.println("id: " + id);
//            String status = request.getParameter("status");
            String nome = request.getParameter("txtNome");
            System.err.println("nome: " + nome);
            String genero = request.getParameter("txtGenero");
            System.err.println("genero: " + genero);
            String dataNascimento = request.getParameter("txtDataNascimento");
            System.err.println("dataNascimento: " + dataNascimento);
            String cpf = request.getParameter("txtCpf");
            System.err.println("cpf: " + cpf);
            String tipoTelefone = request.getParameter("txtTipoTelefone");
            System.err.println("tipoTelefone: " + tipoTelefone);
            String ddd = request.getParameter("txtDDD");
            System.err.println("ddd: " + ddd);
            String numeroTelefone = request.getParameter("txtTelefone");
            System.err.println("numeroTelefone: " + numeroTelefone);
            String email = request.getParameter("txtEmail");
            System.err.println("email: " + email);
            String senha = request.getParameter("txtSenha");
            System.err.println("senha: " + senha);
            String tipoResidencia = request.getParameter("txtTipoResidencia");
            System.err.println("tipoResidencia: " + tipoResidencia);
            String tipoLogradouro = request.getParameter("txtTipoLogradouro");
            System.err.println("tipoLogradouro: " + tipoLogradouro);
            String logradouro = request.getParameter("txtLogradouro");
            System.err.println("logradouro: " + logradouro);
            String numero = request.getParameter("txtNumero");
            System.err.println("numero: " + numero);
            String bairro = request.getParameter("txtBairro");
            System.err.println("bairro: " + bairro);
            String cep = request.getParameter("txtCep");
            System.err.println("cep: " + cep);
            String cidade = request.getParameter("txtCidade");
            System.err.println("cidade: " + cidade);
            String estado = request.getParameter("txtEstado");
            System.err.println("estado: " + estado);
            String pais = request.getParameter("txtPais");
            System.err.println("pais: " + pais);

            if (id != null) {
                cliente.setId(Integer.parseInt(id));
            }

            cliente.setDataNascimento(dataNascimento);
            cliente.setNome(nome);
            cliente.setGenero(genero);
            cliente.setCpf(cpf);

            telefone.setTipoTelefone(tipoTelefone);
            telefone.setDdd(ddd);
            telefone.setNumero(numeroTelefone);
            cliente.setEmail(email);

            usuario.setSenha(senha);
            endereco.setTipoResidencia(tipoResidencia);
            endereco.setTipoLogradouro(tipoLogradouro);
            endereco.setLogradouro(logradouro);
            endereco.setNumero(numero);
            endereco.setBairro(bairro);
            endereco.setCidade(cidade);
            endereco.setCep(cep);
            endereco.setEstado(estado);
            endereco.setPais(pais);

            cliente.setEndereco(endereco);
            cliente.setUsuario(usuario);
            cliente.setTelefone(telefone);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("cliente: " + cliente);
        return cliente;
        
    }

}
