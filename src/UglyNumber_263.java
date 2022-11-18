//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//Given an integer n, return true if n is an ugly number.

public class UglyNumber_263 {

    public static void main(String[] args) {
     int n = 8;
     System.out.println(isUgly(n));
    }
    public static boolean isUgly(int n) {


        if( n == 1 ) return true;
        if (n <= 0) return false;
        while(n > 1){
            if(n%2 == 0) n = n/2;
            else if(n%3 == 0) n = n/3;
            else if(n%5 == 0) n = n/5;
            else return false;
        }

        return true;

    }
}
