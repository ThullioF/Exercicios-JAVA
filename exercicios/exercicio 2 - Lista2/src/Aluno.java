public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

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
            this.p1 = idade;
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
            this.p2 = idade;
        }
        else {
            System.out.println("Nota 2 negativa inválida");
        }
    }
}
