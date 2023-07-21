package codegym.day_15;


public class Main {
    public void m() throws NumberFormatException{
        throw new NumberFormatException();
    }
    public void n(){
        m();
    }
    public void p(){
        try{
            n();
        }catch (NumberFormatException e){
            System.out.println("abc");
        }
    }

}
