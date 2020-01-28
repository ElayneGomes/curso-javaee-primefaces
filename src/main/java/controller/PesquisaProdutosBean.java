package controller;

import Bean.Treinamento;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@ViewScoped
public class PesquisaProdutosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> produtosFiltrados;
    private Integer produtoSelecionado;

    public PesquisaProdutosBean() {
        this.produtosFiltrados = new ArrayList<>();
        for (int i=0; i < 50; i++){
            produtosFiltrados.add(i);
        }
    }

    public void excluirProduto(){
        produtosFiltrados.remove(produtoSelecionado);
        produtoSelecionado = null;
    }

    public List<Integer> getProdutosFiltrados() {
        return produtosFiltrados;
    }

    public void setProdutosFiltrados(List<Integer> produtosFiltrados) {
        this.produtosFiltrados = produtosFiltrados;
    }

    public Integer getProdutoSelecionado() {
        return produtoSelecionado;
    }

    public void setProdutoSelecionado(Integer produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }
}
