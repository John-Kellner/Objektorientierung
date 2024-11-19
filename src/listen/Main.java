package listen;

import streams.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Container<Person> personContainer = new Container<>();
        personContainer.set(new Person());
        Person object = personContainer.getObject();


        Schrank schrank= new Schrank();
        schrank.add(new Person());
        Object obj = schrank.getObj();
        Person p = (Person) obj;


        List<Eintrag> container = new ArrayList<>();
        List<Person> sd = new ArrayList<>();
        List<String> sd2 = new ArrayList<>();

        container.add(new Eintrag("John", "Kellner", "+492313553452"));
        container.add(new Eintrag("Fabi", "Kellner", "+492313553452"));
        container.add(new Eintrag("Joachim", "Kellner", "+492313553452"));
        container.remove(new Eintrag("Tim", "Kellner", "+492313553452"));


        for (Eintrag name : container) {
            System.out.println("Name : " + name);
        }


    }


}
