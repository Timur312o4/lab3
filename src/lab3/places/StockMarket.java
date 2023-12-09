package lab3.places;


import lab3.interfaces.Tradable;
import lab3.tovars.FrVeg;
import lab3.tovars.Tovar;

public class StockMarket extends Places implements Tradable {
    protected Object tovar;
    public StockMarket(String name, Object tovar){
        super(name,PlacesType.STOCKMARKET);
        this.tovar = tovar;
    }
    @Override
    public void trade(Tovar tovars){
        System.out.println("он"+" продавать "+tovars);
    }

    public void otl(Places obj){
        System.out.println( name + " Отличается от "+obj);
    }
}
