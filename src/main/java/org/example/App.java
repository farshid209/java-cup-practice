package org.example;

import java.util.Scanner;

public class App {
//    public static void main(String[] args) {
//
//        while (true) {
//            Scanner ali = new Scanner(System.in);
//            System.out.println("مقدار طول آرایه را وارد کنید:");
//            int n = ali.nextInt();
//            String[] arr = new String[n];
//
//            System.out.println(n + " عضو وارد کنید");
//            for (int i = 0; i < n; i++) {
//                String str = ali.next();
//                arr[i] = str;
//            }
//
//            boolean checkLoop = false;
//            for (int i = 0; i<n; i++){
//                if (arr[i].equals("exit")){
//                    checkLoop =true;
//                    break;
//                }
//            }
//            if (checkLoop){
//                break;
//            }
//
//            System.out.println("یک گزینه را انتخاب کنید:");
//            System.out.println("گزینه ۱ میانگین طول اعضا");
//            System.out.println("گزینه ۲ مجموع طول اعضا");
//            int b = ali.nextInt();
//            if (b == 1) {
//                int tool = 0;
//                for (int j = 0; j < n; j++) {
//                    tool = tool + arr[j].length();
//                }
//                double r = tool / n;
//                System.out.println("میانگین طول اعضا برابر است با: " + r);
//
//            } else if (b == 2) {
//                int tool = 0;
//                for (int j = 0; j < n; j++) {
//                    tool = tool + arr[j].length();
//                }
//                System.out.println("مجموع طول اعضا: " + tool);
//            } else {
//                System.out.println("گزینه انتخابی صحیح نیست!");
//            }
//        }
//
//    }

    public static void main(String[] args) {
        int[] nomarat = {40, 2, 90, 12, 53, 87, 22, 1, 10};
        int[] result = sortIntArr(nomarat);

        for (int a : result) {
            System.out.print(a + ", ");
        }
    }

    public static int[] sortIntArr(int[] arr) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }

        return arr;
    }

    public static boolean compeyrToArrys(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
