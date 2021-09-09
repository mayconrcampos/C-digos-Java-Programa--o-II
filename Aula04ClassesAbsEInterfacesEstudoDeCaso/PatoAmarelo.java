package Aula04ClassesAbsEInterfacesEstudoDeCaso;

public class PatoAmarelo extends Pato {

    public PatoAmarelo(){
        nado = new NadoBoiando();
        voo = new VooBaixo();
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
