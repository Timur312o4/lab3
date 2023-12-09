package lab3.Persons;
import lab3.interfaces.Earnable;
import lab3.interfaces.*;
import lab3.objects.Money;
import lab3.tovars.Tovar;

public class MainHero extends Person implements Nahodable, Earnable {
    private int counter=0;
    protected String pronoun;
    public MainHero(String name,String pol){
        super(name);
        if (pol.equals("ж")){
            pronoun = "она";
        }else{
            if (pol.equals("м")){
                pronoun= "он";
            }else{
                pronoun = "оно";
            }
        }
    }
    @Override
    public void earn(String howMany, Money obj) {
        System.out.println( howMany+ " мог заработать "+ obj);
    }
    public String sobiralsa(Tovar obj){
        return "собирался " + buy(obj.getName());
    }
    public String getName() {
        if (counter % 2 == 0) {
            counter++;
            return name;
        } else {
            counter++;
            return "он";
        }
    }
    public String buy(String obj){
        return "скупить "+ obj;
    }
    @Override
    public String nahod(String need, boolean gp, String location) {
        if (gp){
            return need + " находиться в " + location;
        }else{
            return " не" + need + " находиться в " + location;
        }
    }
}
