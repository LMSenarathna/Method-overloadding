public class Host {

    String hosting(String x){
        return x;// Methana print statement danna ba
    }
    int hosting(int x){
        return x;
    }
    double hosting(double x){
        return x;
    }


    public static void main(String[] args){

        Host s = new Host();
        System.out.println(s.hosting("Linara") );//uda method eke return wenawanam print eka danna argument ekath ekka
        System.out.println(s.hosting(2) );
        System.out.println(s.hosting(2.2389) );
    }

}
