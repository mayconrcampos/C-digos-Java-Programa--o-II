package Aula03ClassesAbstratasInterfaces;

public class Veiculo {
    private String modelo;

    private String marca;

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
