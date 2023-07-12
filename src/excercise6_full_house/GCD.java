package excercise6_full_house;

import java.util.Arrays;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("test1 arr có 2 phần tử");
        int[] arr1 = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Phần tử thứ " + i + " : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("arr có 2 phần tử : "+ Arrays.toString(arr1) +" Có UCLN là : " + findGcd(arr1) + "\n");

        System.out.println("test2 arr có 4 phần tử và các phần tử có giá trị trên 100");
        int[] arr2 = new int[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Phần tử thứ " + i + " : ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("arr có 4 phần tử có giá trị trên 100 : " + Arrays.toString(arr2) + " Có UCLN là : " + findGcd(arr2)  + "\n");

        sc.close();
    }
  public static int gcd(int a ,int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
  }
  public static int findGcd(int[] arr){
        int result = arr[0];
      for (int i = 0; i < arr.length; i++) {
         result = gcd(result,arr[i]);
      }
      return result;
  }


}
