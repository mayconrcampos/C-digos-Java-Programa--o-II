package Aula03ClassesAbstratasInterfaces;

public class Pedal implements Locomocao{
    

    @Override
    public void acelerar(){
        System.out.println("Acelerando com pedal.");
    }
}
