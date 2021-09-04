package Aula03ClassesAbstratasInterfaces;

public class PrincipalVeiculo {
    
    public static void main(String[] args) {
        

        Bike bike = new Bike();
        bike.acelerar();

        Carro carro = new Carro();
        carro.setMotor("2.0");
        carro.acelerar();
    }
}
