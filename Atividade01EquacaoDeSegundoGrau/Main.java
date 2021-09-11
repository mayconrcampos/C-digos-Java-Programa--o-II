package Atividade01EquacaoDeSegundoGrau;

public class Main {

    /**
     * Atividade 01 - Explicação da Solução.
     * 
     *  - Foram criadas 3 classes principais.
     *      - Valores - Possui três atributos: a, b e c. Possui método construtor, getters e setters.
     *      - Equação - Possui três métodos estáticos: EquacaoDeSegundoGrau que recebe o objeto valores como parâmetro.
     *      - Este primeiro método chama o método CalculaDelta passando o objeto valores como parâmetro. O valor é atribuido a        variável delta.
     *      - Por último, é chamado o método CalculaRaiz que recebe o delta mais o objeto valores.
     * 
     *      - A validação de valores digitados acontece na terceira Classe chamada Read.
     *      - Dispensando o uso da classe Scanner, ali em Read são utilizadas as classes BufferedReader e                     *        InputStreamReader para inserção de dados via teclado as quais fazem perfeito tratamento de buffer e lixo de  *        memória oriundos da entrada de dados.
     *      - São utilizados dois métodos... sendo o primeiro readString que faz a leitura do teclado e o segundo método *       readDouble que captura uma string e tenta transformar o dado inserido em Double dentro do bloco Try:
     *      - Se caso o dado inserido pelo usuário não for um Double válido, ele entra no Catch e retorna o valor 0.0 que é *        utilizado dentro do método main, onde se o usuário digitar 0 ou algum caracter que não seja um Double válido, *        ele entra no laço while para pedir que o usuário digite novamente.
     *      - O programa só irá aceitar valores numéricos que sejam diferentes de zero, positivos ou negativos. 
     *      - Assim que o valor for aceito, será transformado em Double.
     * 
     * 
     *      - O programa roda dentro de um laço Do While para que o usuário possa fazer vários cálculos, e após cada um deles *        o programa pergunta se deseja continuar. Ao digitar s ou S ele continua. Se digitar qualquer outro valor ele *        encerra a execução.
     */
    
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

            Equacao.EquacaoDeSegundoGrau(valores);

            System.out.println("Você deseja continuar? s/n");
            continua = Read.readString();

            while(continua.compareTo("") == 0 || continua.compareTo("erro") == 0){
                System.out.println("Digite ou S - Sim ou N - Não");
            }
        } while (continua.compareTo("S") == 0 || continua.compareTo("s") == 0);

        System.out.println("Você saiu do programa.");
    }
}
