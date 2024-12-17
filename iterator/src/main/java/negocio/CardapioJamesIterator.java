package negocio;

public class CardapioJamesIterator implements IteratorDoIgor<ItemDoCardapio> {
    private CardapioJames cardapioJames;

    public CardapioJamesIterator(CardapioJames cardapioJames) {
        this.cardapioJames = cardapioJames;
    }

    @Override
    public boolean temProximo() {
        return !this.cardapioJames.getItensDoCardapio().isEmpty();
    }

    @Override
    public ItemDoCardapio proximo() {
        ItemDoCardapio itemDoCardapio = this.cardapioJames.getItensDoCardapio().poll();
        return itemDoCardapio;
    }

    @Override
    public void adicionar(ItemDoCardapio itemDoCardapio) {
        this.cardapioJames.adicionarItem(itemDoCardapio);
    }
}
