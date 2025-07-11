package Com.practice;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
    //    fun(2,3,45,5,67,7);
      //  fun();
       multiple(2,3,"amit","sujit");
    }

    static void multiple(int a,int b,String ...v){

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    }

