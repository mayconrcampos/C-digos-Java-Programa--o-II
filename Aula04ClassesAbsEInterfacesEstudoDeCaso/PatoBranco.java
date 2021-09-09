package Aula04ClassesAbsEInterfacesEstudoDeCaso;

public class PatoBranco extends Pato{
    
    public PatoBranco(){
        NadarMergulhando nado = new NadarMergulhando();
        VooAlto voar = new VooAlto();

    }

    public void correr() {
        System.out.println("Pato branco correndo");
    }

    @Override
    public void nadar() {
        
        this.nadar();
    }

    @Override
    public void voar(){
        this.voar();
    }
}

// Pato branco pode nadar mergulhando
