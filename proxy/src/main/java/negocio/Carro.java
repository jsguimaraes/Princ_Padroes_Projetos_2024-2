package negocio;

public class Carro {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private String chassi;

    public boolean manobrar(Modelo m) {
        if (m.estaHabilitado()) {
            System.out.println("Manobrar Carro");
            return true;
        }
        System.out.println("Empregado NÃO esta HABILITADO");
        return false;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}