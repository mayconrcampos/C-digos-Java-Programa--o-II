package Aula03ClassesAbstratasInterfaces;

public class Bike extends Veiculo {

    public Bike(){
        this.instanciarLocomocao();
    }

    @Override
    public void instanciarLocomocao(){
        locomocao = new Pedal();
    }
  
}
