package listen;

public class Container<H> {
    private H h;

    public void set(H h){
        this.h= h;
    }

    public H getObject(){
        return h;
    }

}
