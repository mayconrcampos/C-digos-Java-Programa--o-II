package Aula04ClassesAbsEInterfacesEstudoDeCaso;

import java.lang.reflect.Method;

public abstract class Pato {

    protected Nado nado;
    protected Voo voo;
    
    public void grasnar() {
        System.out.println("Pato grasnando.");
    }
    abstract public void nadar();

    abstract public void voar();
}
