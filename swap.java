package Com.practice;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr ={12,34,56,78,90};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change (int[] num){
        num[0]= 22;
        num[3]=99;
    }
}
