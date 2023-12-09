package lab3.tovars;

public abstract class Tovar {
    protected String name;
    @Override
    public String toString(){
        return (name+" ");
    }
    @Override
    public int hashCode() {
        return (this.name).length()*(100-7);
    }
    @Override
    public boolean equals(Object obj){
        return obj.hashCode()==this.hashCode();
    }
    public String getName(){
        return this.name;
    }
}
