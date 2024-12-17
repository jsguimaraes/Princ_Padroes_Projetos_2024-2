package negocio;

public class CardapioReversoIterator implements IteratorDoIgor<ItemDoCardapio> {
    private Cardapio cardapio;
    private int posicao;

    public CardapioReversoIterator(Cardapio cardapio) {
        this.cardapio = cardapio;
        this.posicao = cardapio.getNumeroDeItens() - 1;
    }

    @Override
    public boolean temProximo() {
        return posicao >= 0;
    }

    @Override
    public ItemDoCardapio proximo() {
        ItemDoCardapio itemDoCardapio = this.cardapio.getItensDoCardapio()[posicao];
        posicao--;
        return itemDoCardapio;
    }

    @Override
    public void adicionar(ItemDoCardapio itemDoCardapio) {
        this.cardapio.adicionarItem(itemDoCardapio);
    }
}
