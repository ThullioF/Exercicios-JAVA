package aluno;
public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;
    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    public Aluno(){

    }

    public int getNumeroAluno() {
        return numeroAluno;
    }
    public void setNumeroAluno(int numeroAluno) {
        String numeroAlunoString = String.valueOf(numeroAluno);
        if (numeroAlunoString.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else {
            System.out.println("Número de aluno inválido");
        }
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
        else {
            System.out.println("Idade negativa inválida");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome.length() == 30){
            this.nome = nome;
        }
        else {
            System.out.println("Tamanho de nome ultrapassa 30 caracteres");
        }
    }

    public float getP1() {
        return p1;
    }
    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        }
        else {
            System.out.println("Nota 1 negativa inválida");
        }
    }

    public float getP2() {
        return p2;
    }
    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        }
        else {
            System.out.println("Nota 2 negativa inválida");
        }
    }

    public void notaFinal(){
        float media = (getP1()+getP2()) / 2;
        System.out.println("Média: " + media);
    }
    public void dadosAluno (){
        System.out.println("Número aluno: " + numeroAluno);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
