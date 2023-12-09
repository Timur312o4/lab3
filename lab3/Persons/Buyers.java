package lab3.Persons;

import lab3.interfaces.Earnable;
import lab3.objects.Money;
import lab3.tovars.Tovar;

public class Buyers extends Person implements Earnable {

    public Buyers(String name){
        super(name);
    }
    public String buy(Tovar tovar){
        return "купить " + tovar;
    }
    public String scream(String word,String tovar){
        return "выкрикивать" + word + " " + tovar;
    }
    @Override
    public void earn(String count, Money obj){
        System.out.println(count + " Заработать "+ obj);
    }
    public void want(Object obj){
        System.out.println("хочет "+name+" "+obj+" ");
    }
    public void remains(Person name,String charact,String k){
        System.out.println(name+"остается "+charact+ " "+k);
    }
}
