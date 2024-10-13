package lebewesen;

import lebewesen.personen.pers.Person;
import lebewesen.tiere.gen.Tier;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Tier> tiere = new ArrayList<>();
    private List<Person> besucher = new ArrayList<>();


    // Ich fügre hier ein affe hinzu
    public void add(Tier affe){
        this.tiere.add(affe);
    }

    public void visit(Person besucher){
        this.besucher.add(besucher);
    }
}
