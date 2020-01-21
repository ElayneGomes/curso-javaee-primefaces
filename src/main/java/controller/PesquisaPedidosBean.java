package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class PesquisaPedidosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> pedidosFiltrados;

    public PesquisaPedidosBean() {
        this.pedidosFiltrados = new ArrayList<>();
        for (int i=0; i < 50; i++){
            pedidosFiltrados.add(i);
        }
    }

    public List<Integer> getPedidosFiltrados() {
        return pedidosFiltrados;
    }

    public void setPedidosFiltrados(List<Integer> pedidosFiltrados) {
        this.pedidosFiltrados = pedidosFiltrados;
    }
}
