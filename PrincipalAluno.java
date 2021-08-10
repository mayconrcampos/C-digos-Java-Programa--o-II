public class PrincipalAluno {
    

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Maycon Campos");
        //aluno.setNome("Maycon Campos");
        System.out.println(aluno.getNome()); 

        aluno.testeSobrecarga();
        aluno.testeSobrecarga("Olár abiguinho!");
        
    }
}
