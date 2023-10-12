package org.example;

public class Main {
    // public static void main(String[] args) {
    //      System.out.println("Farshid");
    // }
    public static void main(String[] args) {
//      int a;
//      a=12;
//      a+=2;
//      int b;
//      b = 4;
//      b ++;
//      b = a * b ;
//      System.out.println(b);

//        double x;
//        x = 5.0 / 2.0;
//        System.out.println(x);
//        x = 7 + 3 * 6 / 2 - 1;
//        System.out.println(x);
//        x = (3 * 9 * (3 + (9 * 3 / (3))));
//        System.out.println(x);
//
//        for (int i=6 ; i>0 ; i--){
//            System.out.println(i);
//        }
        printPrims(1379 );
    }

    static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void printPrims (int a){
        for (int i=1 ; i<a ; i++){
          boolean c =isPrime(i);
           if (c==true){
               System.out.println(i);
           }
        }
    }


}