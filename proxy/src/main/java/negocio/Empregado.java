package negocio;

import java.util.Date;

public class Empregado implements Modelo {
    private int idade;
    private boolean habilitado;
    private String nome;
    private Date dataNascimento;
    private String carteiraHabilitacao;

    public Empregado(int idade, boolean habilitado) {
        this.idade = idade;
        this.habilitado = habilitado;
    }

    public int getIdade() {
        return idade;
    }

    public boolean estaHabilitado() {
        return habilitado;
    }
}
