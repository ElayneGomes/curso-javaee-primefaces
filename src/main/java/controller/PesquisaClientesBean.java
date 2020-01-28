package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class PesquisaClientesBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> clientesFiltrados;
    private Integer clienteSelecionado;

    public PesquisaClientesBean() {
        this.clientesFiltrados = new ArrayList<>();
        for (int i=0; i < 20; i++){
            clientesFiltrados.add(i);
        }
    }

    public void excluirCliente(){
        clientesFiltrados.remove(clienteSelecionado);
        clienteSelecionado = null;
    }

    public List<Integer> getClientesFiltrados() {
        return clientesFiltrados;
    }

    public void setClientesFiltrados(List<Integer> clientesFiltrados) {
        this.clientesFiltrados = clientesFiltrados;
    }

    public Integer getClienteSelecionado() {
        return clienteSelecionado;
    }

    public void setClienteSelecionado(Integer clienteSelecionado) {
        this.clienteSelecionado = clienteSelecionado;
    }

}
