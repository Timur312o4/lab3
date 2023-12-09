package lab3.Persons;

import lab3.interfaces.Earnable;
import lab3.objects.Money;
import lab3.tovars.Tovar;

public class Buyers extends Person implements Earnable {

    public Buyers(String name){
        super(name);
    }
    public String buy(Tovar tovar){
        return "купить "+ tovar;
    }
    public String scream(String tovar){
        return "выкрикивать" + " " + tovar;
    }
    @Override
    public void earn(String count, Money obj){
        System.out.println(count + " Заработать "+ obj);
    }
    public void want(Tovar obj){
        System.out.println(buy(obj)+"которые "+name+" хочет ");
    }
    public void remains(Person name,String charact,String k){
        System.out.println(name+"остается "+charact+ " "+k);
    }
}
