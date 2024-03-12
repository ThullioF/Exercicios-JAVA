package mainTeste;
import person.Person;
import message.Message;
import forum.Forum;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Fulano","FU");
        Person p2 = new Person(2,"Ciclano","CI");
        Person p3 = new Person(8,"Beltrano","BE");

        Forum f1 = new Forum(3,"forum 1","www.sla.com.br");
        Forum f2 = new Forum(4,"forum 2","www.qualquercoisa.com.br");

        f1.addForum(5,"Esse é o primeiro forum",p1);
        f1.addForum(6,"Segundo texto",p2);

        f2.addForum(7,"Esse é o segundo forum",p3);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}