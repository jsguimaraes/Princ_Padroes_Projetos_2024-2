package negocio;

import java.time.LocalDate;

public class Vendedor extends Pessoa {
    private LocalDate inicio;
    private LocalDate fim;

    public Vendedor(int id, String nome, LocalDate inicio, LocalDate fim) {
        super(id, nome);
        this.inicio = inicio;
        this.fim = fim;
    }

    public LocalDate getInicio() {
        return inicio;
    }
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }
    public LocalDate getFim() {
        return fim;
    }
    public void setFim(LocalDate fim) {
        this.fim = fim;
    }   

    @Override
    public String toString() {
        return "Vendedor [id=" + id  + ", nome=" + nome + ", inicio=" + inicio + ", fim=" + fim + "]";
    }
 }