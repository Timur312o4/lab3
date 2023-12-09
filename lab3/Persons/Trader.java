package lab3.Persons;

import lab3.interfaces.Earnable;
import lab3.interfaces.Tradable;
import lab3.places.Places;
import lab3.interfaces.Carryable;
import lab3.objects.*;
import lab3.tovars.Shares;
import lab3.tovars.Tovar;

public class Trader extends Person implements Tradable,Earnable,Carryable {
    public Trader(String name, Places location) {
        super(name, location);
        this.name = name;
    }
    @Override
    public void trade(Tovar tovars){
        System.out.println(" продают " + tovars);
    }
    @Override
    public void carry(Tovar obj) {
        if (obj.toString().substring(obj.toString().length() - 3,obj.toString().length()-1).equals("ии")) {
            System.out.println(name + " носит в кармане" + " свои " + obj);
        }else{
            System.out.println(name + " носит в кармане свой " + obj);
        }
    }
    @Override
    public void earn(String howmany,Money obj)
    {
        System.out.println(name+ howmany +" заработал "+obj);
    }
    public String scream(String obj){
        return "выкрикивать " + obj;
    }
}
