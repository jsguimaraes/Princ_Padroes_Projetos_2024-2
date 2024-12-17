package negocio;

public class CardapioIterator implements IteratorDoIgor<ItemDoCardapio> {

    private Cardapio cardapio;
    private int posicao;

    public CardapioIterator(Cardapio cardapio) {
        this.cardapio = cardapio;
        this.posicao = 0;
    }

    @Override
    public boolean temProximo() {
        return posicao < this.cardapio.getNumeroDeItens();
    }

    @Override
    public ItemDoCardapio proximo() {
        ItemDoCardapio itemDoCardapio = this.cardapio.getItensDoCardapio()[posicao];
        posicao++;
        return itemDoCardapio;
    }

    @Override
    public void adicionar(ItemDoCardapio itemDoCardapio) {
        this.cardapio.adicionarItem(itemDoCardapio);
    }
}
