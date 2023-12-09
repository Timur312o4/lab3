package lab3.places;

import lab3.interfaces.Beable;

public abstract class Places implements Beable {
    protected String name;
    protected PlacesType location;
    public Places(String name, PlacesType location){
        this.name=name;
        this.location = location;
    }
    @Override
    public String toString(){
        return (this.name+" ");
    }
    @Override
    public int hashCode() {
        return (this.name+location).length()*(100-7);
    }
    @Override
    public boolean equals(Object obj){
        return obj.hashCode()==this.hashCode();
    }

    @Override
    public void be(Places place){
        System.out.println( "там был " + place);
    }
    public String getName(){
        return this.name;
    }

}
