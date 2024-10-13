package lebewesen.personen.pers;

import lebewesen.Lebewesen;

public abstract class Person extends Lebewesen {
    protected String name = "Felix";

    public Person() {
        int i = 0;
    }

    public void setName(String name) {
        this.name = name;
    }
}
