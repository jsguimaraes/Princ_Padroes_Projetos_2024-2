package negocio;

public class Cardapio {
    private static final int MAX_ITENS = 4;
    private int numeroDeItens;
    private ItemDoCardapio[] itensDoCardapio;

    public Cardapio() {
        this.numeroDeItens = 0;
        this.itensDoCardapio = new ItemDoCardapio[MAX_ITENS];
        this.itensDoCardapio[0] = new ItemDoCardapio("Ala minuta", "bifé", 20, false);
        this.numeroDeItens++;
        this.itensDoCardapio[1] = new ItemDoCardapio("Bauru de filé", "feito de filé", 50, false);
        this.numeroDeItens++;
    }

    public void adicionarItem(ItemDoCardapio itemDoCardapio) {
        if (numeroDeItens >= MAX_ITENS) {
            System.out.println("deu xabum! não entra mais ninguém no morro!");
        } else {
            this.itensDoCardapio[numeroDeItens] = itemDoCardapio;
            this.numeroDeItens++;
        }
    }

    public ItemDoCardapio[] getItensDoCardapio() {
        return itensDoCardapio;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public static int getMaxItens() {
        return MAX_ITENS;
    }
}
