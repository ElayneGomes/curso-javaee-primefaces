package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class PesquisaUsuariosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Integer> usuariosFiltrados;

    public PesquisaUsuariosBean() {
        this.usuariosFiltrados = new ArrayList<>();
        for (int i=0; i < 50; i++){
            usuariosFiltrados.add(i);
        }
    }

    public List<Integer> getUsuariosFiltrados() {
        return usuariosFiltrados;
    }

    public void setUsuariosFiltrados(List<Integer> usuariosFiltrados) {
        this.usuariosFiltrados = usuariosFiltrados;
    }
}
