package negocio;

import java.util.LinkedList;
import java.util.Queue;

public class CardapioJames {
    private Queue<ItemDoCardapio> itensDoCardapio;

    public CardapioJames() {
        this.itensDoCardapio = new LinkedList<>();
        this.itensDoCardapio.add(new ItemDoCardapio("Ala minuta", "bifé", 20, false));
        this.itensDoCardapio.add(new ItemDoCardapio("Bauru de filé", "feito de filé", 50, false));
        this.itensDoCardapio.add(new ItemDoCardapio("Hamburguer de Grão de Bico", "Grão de Bico", 9.99, true));
        this.itensDoCardapio.add(new ItemDoCardapio("Hamburguer de carne", "Carne", 19.90, false));
        this.itensDoCardapio.add(new ItemDoCardapio("Hamburguer de frango", "Frango", 17.90, false));
        this.itensDoCardapio.add(new ItemDoCardapio("Hamburguer de Salmão", "Salmão", 28.90, false));
    }

    public Queue<ItemDoCardapio> getItensDoCardapio() {
        return itensDoCardapio;
    }

    public void setItensDoCardapio(Queue<ItemDoCardapio> itensDoCardapio) {
        this.itensDoCardapio = itensDoCardapio;
    }

    public void adicionarItem(ItemDoCardapio itemDoCardapio) {
        this.itensDoCardapio.add(itemDoCardapio);
    }

    public void removerItem(ItemDoCardapio itemDoCardapio) {
        this.itensDoCardapio.remove(itemDoCardapio);
    }
}
