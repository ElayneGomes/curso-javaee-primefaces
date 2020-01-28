package controller;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
@Named("cadastroUsuarioBean")
public class CadastroUsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> gruposListado;
    private Integer grupoSelecionado;

    public CadastroUsuarioBean() {
        this.gruposListado = new ArrayList<>();
        gruposListado.add(1);
    }

    public void excluirGrupo(){
        gruposListado.remove(grupoSelecionado);
        grupoSelecionado = null;
    }

    public List<Integer> getGruposListado() {
        return gruposListado;
    }

    public void setGruposListado(List<Integer> gruposListado) {
        this.gruposListado = gruposListado;
    }

    public Integer getGrupoSelecionado() {
        return grupoSelecionado;
    }

    public void setGrupoSelecionado(Integer grupoSelecionado) {
        this.grupoSelecionado = grupoSelecionado;
    }

}
