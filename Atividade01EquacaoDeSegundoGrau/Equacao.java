package Atividade01EquacaoDeSegundoGrau;

public class Equacao {
    
    public static void Equacao(Valores v) {
        Double delta = Equacao.CalculaDelta(v);

        Equacao.CalculaRaiz(delta, v);
    }

    private static Double CalculaDelta(Valores v) {
        Double delta = (v.getB() * v.getB()) - (4 * v.getA() * v.getC());

        return delta;
    }

    private static void CalculaRaiz(Double delta, Valores v) {
        Double divisor;
        Double raiz1;
        Double raiz2;
        if(delta < 0){
            System.out.println("Equação não possui raizes reais");


        }else if(delta == 0){
            System.err.println("A equação possui raizes Reais Iguais.");

            divisor = 2 * v.getA();
            raiz1 = ((-v.getB()) +Math.sqrt(delta)) / divisor;
            raiz2 = ((-v.getB()) -Math.sqrt(delta)) / divisor;

            System.out.println("Raiz 1: "+raiz1);
            System.out.println("Raiz 2: "+raiz2);
            
        }else{
            System.err.println("A equação possui duas Raizes Reais Distintas");

            divisor = 2 * v.getA();
            raiz1 = ((-v.getB()) +Math.sqrt(delta)) / divisor;
            raiz2 = ((-v.getB()) -Math.sqrt(delta)) / divisor;

            System.out.println("Raiz 1: "+raiz1);
            System.out.println("Raiz 2: "+raiz2);
        }
    }
}
