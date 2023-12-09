package lab3.tovars;
import lab3.interfaces.*;
public class Shares extends Tovar implements Fallable {
    protected String name;

    public Shares(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return (this.name + " ");
    }

    @Override
    public void fall() {
        System.out.println("которые упадут в цене");
    }

    public String getName() {
        return name;
    }

    public String nameCost() {
        return "название и цена " + name;

    }
}
