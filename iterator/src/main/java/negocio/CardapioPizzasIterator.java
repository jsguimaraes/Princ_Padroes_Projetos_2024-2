package negocio;

public class CardapioPizzasIterator implements IteratorDoIgor<ItemDoCardapio> {
    private CardapioPizzas cardapioPizzas;
    private int posicao;

    public CardapioPizzasIterator(CardapioPizzas cardapioPizzas) {
        this.cardapioPizzas = cardapioPizzas;
        this.posicao = 0;
    }

    @Override
    public boolean temProximo() {
        return posicao < this.cardapioPizzas.getItensDoCardapio().size();
    }

    @Override
    public ItemDoCardapio proximo() {
        ItemDoCardapio itemDoCardapio = this.cardapioPizzas.getItensDoCardapio().get(posicao);
        posicao++;
        return itemDoCardapio;
    }

    @Override
    public void adicionar(ItemDoCardapio itemDoCardapio) {
        this.cardapioPizzas.adicionarItem(itemDoCardapio);
    }
}
