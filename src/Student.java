public class Student {

    static void studentId(String name , int id){
        System.out.println("Name " + name + "ID" + id);

    }

    static void studentId(int id , String name ){
        System.out.println("Name " + name + "ID" + id);

    }

    public static void main(String[] args){

        Student.studentId("Linara" , 1234);
        Student.studentId(1234, "Ayoshitha");

    }

}
