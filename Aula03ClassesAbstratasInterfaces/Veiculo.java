package Aula03ClassesAbstratasInterfaces;

public abstract class Veiculo {
    private String modelo;

    private String marca;

    protected Locomocao locomocao;

    public abstract void instanciarLocomocao();

    public void acelerar() {
        locomocao.acelerar();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void parar() {
        System.out.println("Parar");
    }
}
