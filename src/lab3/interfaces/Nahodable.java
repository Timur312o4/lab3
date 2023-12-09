package lab3.interfaces;

public interface Nahodable {
    default String nahod(String ned,boolean gp, String location){
        if (gp){
            return ned + " Находиться в " + location;
        }
        else{
            return "не" + ned+" Находиться"+ location;
        }
    }
}
