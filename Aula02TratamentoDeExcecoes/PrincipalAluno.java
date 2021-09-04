package Aula02TratamentoDeExcecoes;

public class PrincipalAluno {
    

    public static void main(String[] args) {
        

        try {
            Aluno aluno = null;

            if(aluno == null){
                System.out.println(aluno.getNome()); 
            }
            

            System.out.println("Chegou ao fim do try.");
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        } finally {
            System.out.println("Passou pelo Finally");
        }
    }
}
