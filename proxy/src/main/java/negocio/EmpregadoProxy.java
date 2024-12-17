package negocio;

public class EmpregadoProxy implements Modelo {
    private Empregado empregado;

    public EmpregadoProxy(Empregado empregado) {
        this.empregado = empregado;
    }

    public EmpregadoProxy(int idade, boolean habilitado) {
        this.empregado = new Empregado(idade, habilitado);
    }

    @Override
    public int getIdade() {
        return empregado.getIdade();
    }

    @Override
    public boolean estaHabilitado() {
        return empregado.estaHabilitado();
    }
}
