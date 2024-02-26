public class Aluno {
    public int numeroALuno, idade;
    public String nome;
    public float p1, p2, media;
    public Aluno(int numeroALuno, int idade, String nome, float p1, float p2){
        this.numeroALuno = numeroALuno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void notaFinal(){
        media = (this.p1 + this.p2) / 2;
        System.out.println("A média é: " + media);
    }
    public void dadosAlunos(){
        System.out.println("Número aluno: " + this.numeroALuno + " Nome: " + this.nome + " Idade: " + this.idade);
    }
    public void passou(){
        if(media >= 6){
            System.out.println("Aluno aprovado");}
        else {
            System.out.println("Aluno reprovado");
        }
        }
    }

