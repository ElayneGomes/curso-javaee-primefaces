package controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CadastroPedidoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> itens;

    public CadastroPedidoBean() {
        this.itens = new ArrayList<>();
        itens.add(1);
    }

    public List<Integer> getItens() {
        return itens;
    }

    public void setItens(List<Integer> itens) {
        this.itens = itens;
    }
}
