/**
 * Aluno
 */
public class Aluno {

    private String nome;

    public Aluno(String nome){
        this.setNome(nome);
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void testeSobrecarga() {
        System.out.println("Entrou no método testeSobrecarga()");
    }

    public void testeSobrecarga(String frase) {
        System.out.println("Método de teste de sobrecarga: Frase: "+frase);
    }


}