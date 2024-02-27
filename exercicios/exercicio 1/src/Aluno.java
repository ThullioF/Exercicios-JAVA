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
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String dadosAlunos(){
        return ("Número aluno: " + this.numeroALuno + " Nome: " + this.nome + " Idade: " + this.idade
        + "Média: " + this.notaFinal());
    }
    public void passou(){
        if(this.notaFinal() >= 6){
            System.out.println("Aluno aprovado");}
        else {
            System.out.println("Aluno reprovado");
        }
        }
    }

