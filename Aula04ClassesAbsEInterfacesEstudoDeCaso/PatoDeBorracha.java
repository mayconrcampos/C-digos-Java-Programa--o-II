package Aula04ClassesAbsEInterfacesEstudoDeCaso;

public class PatoDeBorracha extends Pato{
    
    public PatoDeBorracha(){
        NadoBoiando nadar = new NadoBoiando();
        NaoVoa voar = new NaoVoa();
    }

    public void pular() {
        System.out.println("Pato de Borracha pulando");
    }

    @Override
    public void voar() {
        this.voar();
    }

    @Override
    public void nadar(){
        this.nadar();
    }
}


// Patos de borracha não podem voar e nadam boiando.
