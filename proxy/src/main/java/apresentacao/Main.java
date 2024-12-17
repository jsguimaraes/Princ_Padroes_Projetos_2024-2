package apresentacao;

import negocio.Carro;
import negocio.EmpregadoProxy;
import negocio.Modelo;

public class Main {
    public static void main(String[] args) {
        Modelo estagiario = new EmpregadoProxy(17, false);
        Modelo administrativo = new EmpregadoProxy(30, false);
        Modelo habilitado = new EmpregadoProxy(25, true);

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Tentando manobrar com o estagiário:");
        carro1.manobrar(estagiario); 

        System.out.println("\nTentando manobrar com o empregado administrativo:");
        carro2.manobrar(administrativo); 

        System.out.println("\nTentando manobrar com o empregado habilitado:");
        carro1.manobrar(habilitado); 
    }
}
