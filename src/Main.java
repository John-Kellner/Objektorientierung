import lebewesen.Zoo;
import lebewesen.personen.Felix;
import lebewesen.personen.Johannes;
import lebewesen.personen.Lennart;
import lebewesen.tiere.Affe;
import lebewesen.tiere.Elefant;
import lebewesen.tiere.Giraffe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Felix felix1 = new Felix("Felix1");
        Felix felix2 = new Felix("Felix2");

        Johannes johannes = new Johannes("Johannes");
        Lennart lennart = new Lennart("Lennart");

        Affe affe = new Affe();
        Affe affe2 = new Affe();
        Elefant elefant = new Elefant();
        Giraffe giraffe = new Giraffe();

        Zoo zoo = new Zoo();
        zoo.add(affe);
        zoo.add(affe2);
        zoo.add(elefant);
        zoo.add(giraffe);

        zoo.visit(felix1);
        zoo.visit(johannes);
        zoo.visit(lennart);

    }
}