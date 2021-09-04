package Aula03ClassesAbstratasInterfaces;

public class Carro extends Veiculo {

    private String motor;

    public Carro(){
        this.instanciarLocomocao();
    }

    @Override
    public void instanciarLocomocao(){
        locomocao = new Motor();
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return this.motor;
    }

    public void parar() {
        System.out.println("Carro parado.");
    }
}
