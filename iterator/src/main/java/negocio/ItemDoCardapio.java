package negocio;

public class ItemDoCardapio {
    private String nome;
    private String descricao;
    private double preco;
    private boolean vegetariano;

    public ItemDoCardapio(String nome, String descricao, double preco, boolean vegetariano) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.vegetariano = vegetariano;
    }

    public ItemDoCardapio() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public boolean isVegetariano() {
        return vegetariano;
    }
    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    @Override
    public String toString() {
        return "ItemDoCardapio [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", vegetariano="
                + vegetariano + "]";
    }
}
