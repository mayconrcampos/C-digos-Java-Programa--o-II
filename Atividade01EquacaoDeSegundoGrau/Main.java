package Atividade01EquacaoDeSegundoGrau;

public class Main {
    
    public static void main(String[] args) {
        
        Double a;
        Double b;
        Double c;
        String continua;
        
        do {
            System.out.println("Digite o valor de A");
            a = Read.readDouble();
            while(a == 0){
                System.out.println("Equação de Segundo Grau: O valor de A deve ser diferente de 0");
                a = Read.readDouble();
            }

            System.out.println("Digite o valor de B");
            b = Read.readDouble();
            while(b == 0){
                System.out.println("Equação de Segundo Grau: O valor de B deve ser diferente de 0");
                b = Read.readDouble();
            }

            System.out.println("Digite o valor de C");
            c = Read.readDouble();
            while(c == 0){
                System.out.println("Equação de Segundo Grau: O valor de C deve ser diferente de 0");
                c = Read.readDouble();
            }

            Valores valores = new Valores(a, b, c);

            Equacao.Equacao(valores);

            System.out.println("Você deseja continuar? s/n");
            continua = Read.readString();

            while(continua.compareTo("") == 0 || continua.compareTo("erro") == 0){
                System.out.println("Digite ou S - Sim ou N - Não");
            }
        } while (continua.compareTo("S") == 0 || continua.compareTo("s") == 0);

        System.out.println("Você saiu do programa.");
    }
}
