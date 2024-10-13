package lebewesen.personen;

import lebewesen.personen.pers.Person;

public class Felix extends Person {
    private String brand;

    //Constructor - inititialisierung
    public Felix(String name) {
        this.brand = "Tatoo";
        super.name =name;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        //implementierung
    }
}
