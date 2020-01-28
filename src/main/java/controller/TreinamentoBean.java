package controller;

import Bean.Treinamento;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@ViewScoped
public class TreinamentoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String[] nomes = {"João", "Maria", "José", "Eduardo", "Sebastião", "Mariana", "Francisco",
            "Manoel", "Fernanda", "Gabriela", "Mário", "Marcos"};

    private static final String[] sobrenomes = {"Souza", "Silva", "Andrade", "Machado", "Júnior", "Albuquerque", "Alencar",
            "Assis", "Batista", "Camargo", "Coelho", "Costa", "Dias", "Rosa", "Leal", "Lima", "Leite"};

    private List<Treinamento> treinamentos;

    public TreinamentoBean() throws ParseException {
        treinamentos = new ArrayList<>();

        for (int i = 0; 1 < 50; i++){
            adicionarTreinamento();
        }
    }

    private void adicionarTreinamento() {
        String nomeCompleto = getNomeAleatorio() + "" + getSobrenomeAleatorio() + "" + getSobrenomeAleatorio();
        treinamentos.add(new Treinamento(getMatriculaAleatorio(), nomeCompleto, getDataAleatorio(), getSalarioAleatorio()));
    }

    private BigDecimal getSalarioAleatorio() {
        return new BigDecimal(1000 + (Math.random() * 29000));
    }

    private Long getMatriculaAleatorio() {
        return (long) (Math.random() * 10000);
    }

    private Date getDataAleatorio() {
        long dezAnosEmMillis = 24 * 60 * 60 * 1000;
        long periodoSorteadEmMillis = ((long) (Math.random() * 10 * 365)) * dezAnosEmMillis;
        return new Date(System.currentTimeMillis() - periodoSorteadEmMillis);
    }

    private String getSobrenomeAleatorio(){
        int posicao = (int) Math.round(Math.random() * (sobrenomes.length - 1));
        return sobrenomes[posicao];
    }

    private String getNomeAleatorio(){
        int posicao = (int) Math.round(Math.random() * (nomes.length - 1));
        return nomes[posicao];
    }

    public List<Treinamento> getTreinamentos() {
        return treinamentos;
    }
}
