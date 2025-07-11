package Com.practice;

public class shadow {
     static int x = 10;

    public static void main(String[] args) {
        System.out.println(x);
        int x= 49;
        System.out.println(x);
        fun();

    }
    static int fun(){
        System.out.println(x);
        return x;
    }

}
