package teste;
import aluno.Aluno;
public class MainAluno {
    public static void main(String[] args) {

        Aluno obj = new Aluno();
        obj.setCodigo(10);
        obj.setIdade(19);
        obj.setNota(3);
        System.out.println(" Código " + obj.getCodigo() + " Nota " + obj.getNota());

        Aluno obj2 = new Aluno(11, 19, 8.5f);
        System.out.println(" Código " + obj2.getCodigo() + " Nota " + obj2.getNota());
    }
}