package apresentacao;

import negocio.CardapioJames;
import negocio.CardapioJamesIterator;
import negocio.CardapioPizzas;
import negocio.CardapioPizzasIterator;
import negocio.ItemDoCardapio;
import negocio.IteratorDoIgor;

public class Main {
    public static void main(String[] args) {
        CardapioPizzas cardapioPizzas = new CardapioPizzas(); // Renomeado de PancakeHouseMenu para CardapioPizzas
        printMenu(new CardapioPizzasIterator(cardapioPizzas)); // Renomeado para IteradorCardapioPizzas
        
        System.out.println("===");

        CardapioJames cardapioJames = new CardapioJames(); // Renomeado de JohnMenu para JamesMenu
        printMenu(new CardapioJamesIterator(cardapioJames)); // Renomeado de JohnMenuInterator para JamesMenuIterator
    }

    private static void printMenu(IteratorDoIgor<ItemDoCardapio> iterator) {
        while(iterator.temProximo()) { // Alterado de hasNext() para temProximo()
            System.out.println(iterator.proximo()); // Alterado de next() para proximo()
        }
    }
}
