package Com.practice;

public class overloading {
    public static void main(String[] args) {
        fun("amit");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a);
    }
}
