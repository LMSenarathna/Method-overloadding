public class Idea {

   static void quote(int x , int y){
       System.out.println("I think  : " + x + "plus " + y  +"=" +(x+y) );
   }

    static void quote(String y){
        System.out.println("I think  : " + y + "is the best investment" );
    }

    public static void main(String[] args){

        quote(50,60);
        quote("Education");

    }
}
