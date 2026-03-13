package W4;

import java.util.Enumeration;

public class W4_3 {
    public static void main(String[] args) {
        int a = 3, b = 5;
        double da = 1.2, db = 3.4;
        char c1 = 'x', c2 = 'y';
        int i_arr[] = {2, 5, 3}; // 배열 선언과 동시에 초기화하는 방법
        double d_arr[] = {1.5, 3.6, 7.23};
        char c_arr[] = {'f','r','i','e','n','d'};
        String s_arr[] = {"I", "love","you"};



        System.out.println(a + "+" + b + "=" + sum(a, b));
        System.out.println(da + "+" + db + "=" + sum(da,db));
        System.out.println(c1 + "+" + c2 + "=" + sum(c1,c2)); // “xy” 반환
        System.out.println("sum of int array: " + sum(i_arr)); // 모든 배열원소의 합
        System.out.println("sum of double array: " + sum(d_arr));
        System.out.println("sum of char array: " + sum(c_arr)); // 모든 문자 연결
        System.out.println("sum of String array: " + sum(s_arr)); // 모든 문자열 연결
    }

    static int sum(int a, int b){
        return a+b;
    }
    static double sum(double da, double db){
        return da + db;
    }
    static String sum(char c1, char c2){
        return String.valueOf(c1) + c2 ;
    }
    static int sum(int[] arr){
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num += arr[i];
        }
        return num;
    }
    /*
    static int sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
     */

    static double sum(double[] arr){
        double num = 0;
        for(int i = 0; i < arr.length; i++){
            num += arr[i];
        }
        return num;
    }
    static String sum(char[] arr){
        String num = "";
        for(int i = 0; i < arr.length; i++){
            num += String.valueOf(arr[i]);
        }
        return num;
    }
    /*
    static String sum(char[] arr){
        StringBuilder sum = new StringBuilder();
        for(char c : arr){
            sum.append(c);
        }
        return sum.toString();
    }
     */


    /*
    static String sum(String[] arr){
        String num = "";
        for(int i = 0; i < arr.length; i++){
            num += (arr[i] + " ");
        }
        return num;
    }
     */

    static String sum(String[] arr){
        StringBuilder sum = new StringBuilder();
        for(String s : arr){
            sum.append(s);
            sum.append(" ");
        }
        return sum.toString();
    }


}
