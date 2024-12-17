package negocio;

public interface IteratorDoIgor<T> {
    public boolean temProximo();
    public T proximo();
    public void adicionar(T itemDoCardapio);
    // remove faz vcs....
}
