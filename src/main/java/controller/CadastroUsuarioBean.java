package controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CadastroUsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> gruposListado;

    public CadastroUsuarioBean() {
        this.gruposListado = new ArrayList<>();
        gruposListado.add(1);
    }

    public List<Integer> getGruposListado() {
        return gruposListado;
    }

    public void setGruposListado(List<Integer> gruposListado) {
        this.gruposListado = gruposListado;
    }
}
