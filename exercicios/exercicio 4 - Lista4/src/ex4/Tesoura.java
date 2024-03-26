package ex4;
public class Tesoura extends Coisa{
    @Override
    public String quemSouEU() {
        return "Tesoura";
    }

    @Override
    public void compara(Coisa c) {
        if(c.quemSouEU().equals("Tesoura")){
            System.out.println("Houve empate");
        }
        else if (c.quemSouEU().equals("Pedra")) {
            System.out.println("Tesoura perde para Pedra");
        }
        else if (c.quemSouEU().equals("Papel")){
            System.out.println("Tesoura ganha de Papel");
        }
        else{
            System.out.println("Impossível de calcular");
        }
    }
}
