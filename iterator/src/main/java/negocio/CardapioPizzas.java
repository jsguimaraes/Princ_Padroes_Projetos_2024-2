package negocio;

import java.util.ArrayList;

public class CardapioPizzas {

    private ArrayList<ItemDoCardapio> itensDoCardapio;

    public CardapioPizzas() {
        this.itensDoCardapio = new ArrayList<ItemDoCardapio>();
        this.itensDoCardapio.add(new ItemDoCardapio("Pizza Margherita", "molho de tomate, mussarela e manjericão", 25.00, true));
        this.itensDoCardapio.add(new ItemDoCardapio("Pizza Calabresa", "molho de tomate, mussarela e calabresa", 30.00, false));
        this.itensDoCardapio.add(new ItemDoCardapio("Pizza Quatro Queijos", "queijo mussarela, queijo gorgonzola, queijo parmesão e queijo catupiry", 35.00, true));
        this.itensDoCardapio.add(new ItemDoCardapio("Pizza Pepperoni", "molho de tomate, mussarela e pepperoni", 32.00, false));
    }

    public void adicionarItem(ItemDoCardapio itemDoCardapio) {
        this.itensDoCardapio.add(itemDoCardapio);
    }

    public ArrayList<ItemDoCardapio> getItensDoCardapio() {
        return itensDoCardapio;
    }
}
