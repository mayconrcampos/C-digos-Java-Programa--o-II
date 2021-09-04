package Aula03ClassesAbstratasInterfaces;

public class Carro {

    private String motor;

    public void acelerar() {
        System.out.println("Acelerando com o motor "+this.motor);
    }

    public void parar() {
        System.out.println("Carro parado.");
    }
}
