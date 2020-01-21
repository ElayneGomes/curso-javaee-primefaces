package controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CadastroClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> enderecosListado;

    public CadastroClienteBean() {
        this.enderecosListado = new ArrayList<>();
        enderecosListado.add(1);
    }

    public List<Integer> getEnderecosListado() {
        return enderecosListado;
    }

    public void setEnderecosListado(List<Integer> enderecosListado) {
        this.enderecosListado = enderecosListado;
    }
}
