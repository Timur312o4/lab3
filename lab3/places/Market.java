package lab3.places;
import lab3.interfaces.Tradable;
import lab3.tovars.FrVeg;
import lab3.tovars.Tovar;

public class Market extends Places implements Tradable{
    protected Object tovar;
    public Market(String name,String tovar){
        super(name,PlacesType.MARKET);
        this.name=name;
        this.tovar = tovar;
    }
    @Override
    public void trade(Tovar tovar){
        this.tovar=tovar;
        System.out.println(name + " продавать "+tovar);
    }
    public void tradefr(FrVeg tovar){
        System.out.println(name + " продавать " + tovar);
    }
    public Object getTovar(){
        return tovar;
    }
}
