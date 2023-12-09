package lab3.Persons;

import lab3.objects.Stall;
import lab3.places.Places;
import lab3.interfaces.Tradable;
import lab3.tovars.FrVeg;
import lab3.tovars.Tovar;

public class TraderFructs extends Person implements Tradable{
    public TraderFructs(String name, Places location){
        super(name,location);
    }
    @Override
    public void trade(Tovar tovars){
        System.out.println(" продают " + tovars);
    }
    public String trade(){
        return "торгует";
    }
    public void tradefr(FrVeg tovars){
        System.out.println(name + " продают " + tovars);
    }
    @Override
    public String razl(Stall place){
        return "разложить свой товар на " + place;
    }
}
