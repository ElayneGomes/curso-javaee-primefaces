package controller;

import Bean.Endereco;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
@Named("cadastroClienteBean")
public class CadastroClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Endereco endereco;
    private List<Endereco> enderecosListado = new ArrayList<>();
    private Endereco enderecoSelecionado;

    public CadastroClienteBean() {
        endereco = new Endereco();
        endereco.setLogradouro("Av. Almirante  Barroso");
        endereco.setNumero(455);
        endereco.setComplemento("Sala 923");
        endereco.setCep("38408-111");
        endereco.setCidadeUF("Belém/PA");
        enderecosListado.add(endereco);
    }

    public void incluirEndereco() {
//        Endereco endereco = new Endereco();
        enderecosListado.add(endereco);
        endereco = null;
    }

    public void excluirEnderecoCliente(){
        enderecosListado.remove(enderecoSelecionado);
        enderecoSelecionado = null;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Endereco> getEnderecosListado() {
        return enderecosListado;
    }

    public void setEnderecosListado(List<Endereco> enderecosListado) {
        this.enderecosListado = enderecosListado;
    }

    public Endereco getEnderecoSelecionado() {
        return enderecoSelecionado;
    }

    public void setEnderecoSelecionado(Endereco enderecoSelecionado) {
        this.enderecoSelecionado = enderecoSelecionado;
    }

}