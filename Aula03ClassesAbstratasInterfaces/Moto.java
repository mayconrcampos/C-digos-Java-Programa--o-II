package Aula03ClassesAbstratasInterfaces;

public class Moto extends Veiculo{
    private String motor;

    private String cilindrada;

    public Moto(){
        this.instanciarLocomocao();
    }

    @Override
    public void instanciarLocomocao(){
        locomocao = new Motor();
    }
}
