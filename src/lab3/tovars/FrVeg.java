package lab3.tovars;

public enum FrVeg {
    APPLES("яблоки"),TOMATOES("помидоры"),POTATOES("картофель"),CABBAGES("капуста");
    private final String name;
    FrVeg(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
