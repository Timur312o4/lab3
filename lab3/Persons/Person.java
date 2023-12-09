package lab3.Persons;
import lab3.interfaces.Beable;
import lab3.tovars.NewsPapers;
import lab3.objects.Stall;
import lab3.places.*;
public abstract class Person implements Beable {
    protected String name;
    protected Places location;
    public Person(String name,Places location){
        this.name=name;
        this.location=location;
    }
    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String remember(String word,String what){
        if (word.equals("что")) {
            return " вспомнил, что "+what;
            }
        else{ if (word.equals("про")) {
            return " вспомнил про "+what;
        }else{
            return " вспомнил "+what;
            }
        }
    }

    @Override
    public String toString() {
        return this.name+" ";
    }
    @Override
    public void be(Places obj){
            System.out.println();
    }
    @Override
    public int hashCode() {
        return (this.name+" "+location).length()*1000;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public void remember(String what){
        System.out.println(name+" вспомнил, "+ what);
    }
    public String begin(){
        return "начал";
    }
    public void vnim(NewsPapers obj){
        System.out.print("Обратив внимание на " + obj+" ");
    }
    public String sobiralsa(String verb){
        return "Собирался" + verb;
    }
    public void prikid(String verb){
        System.out.println(this.name+" "+verb + " прикидывать в уме ");
    }
    public void underst(String obj){
        System.out.println(name+" понял, что" + obj);
    }

    public void csee(Object name,String move) {
        System.out.println(this.name+" могли видеть, чем "+ name + move);
    }
    public void can(String charasteristic,String move){
        System.out.println(name+" может "+charasteristic+" "+ move);
    }
    public String need(){
        return " нужно ";
    }
    public void need(String charasteristic,String obj){
        System.out.println(name + " "+ charasteristic+" нужно "+ obj);
    }
    public String razl(Stall obj){
        return "разложить на " + obj;
    }
}

