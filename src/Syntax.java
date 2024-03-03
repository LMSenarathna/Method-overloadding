public class Syntax {


    void math(int x){
        System.out.println("Argument : " + x);
    }
    //
    void math(int x, int y){
        System.out.println("Argument : " + x + "and" + y);
    }
    public static void main(String[] args){

        Syntax s = new Syntax();
        s.math(3);
        s.math(3,7);
    }
}
