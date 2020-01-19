import java.util.Arrays;
import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {
        System.out.println("Homework 2. Arrays \n Задача 1:");

        //Задача 1

        int a = 5;//Задаем размер массива
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = (int) Math.round(Math.random());
            if (arr1[i] == 0) {
                arr2[i] = 1;
            } else {
                arr2[i] = 0;
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr1));
        System.out.println("Перевернутый массив: " + Arrays.toString(arr2)+"\n Задача 2:");

        //Задача 2

        int[] arr3=new int[8];
        for (int i=0; i<8; i++){
            arr3[i]=i*3;
        }
        System.out.println("Массив чисел 0, 3 ... 21:  " + Arrays.toString(arr3)+"\n Задача 3:");

        //Задача 3

        int[] arr4={1,5,3,2,11,4,5,2,4,8,9,1};
        int[] arr5=new int[12];
        System.out.println("Массив вручную заданных чисел:   " + Arrays.toString(arr4));
        for (int i=0; i<12; i++){
            if(arr4[i]<6) {
                arr5[i] = arr4[i] * 2;
            } else{
                arr5[i]=arr4[i];
            }
        }
        System.out.println("Умножаем числа менее 6 на 2:   " + Arrays.toString(arr5)+"\n Задача 4:");

        //Задача 4

        int b=7;
        int[][] arr6 = new int[b][b];
        for (int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                if(i==j || (i+j)==(b-1)){
                    arr6[i][j]=1;
                } else {
                    arr6[i][j]=0;
                }
            }
            System.out.println(Arrays.toString(arr6[i]));
        }
    System.out.println("Задача 5");
    //  Задача 5:
    int amax=arr4[0];
    int amin=arr4[1];
    for(int i=0; i<12; i++) {
        if (arr4[i] > amax) {
            amax = arr4[i];
        }
        if (arr4[i] < amin) {
            amin = arr4[i];
        }
    }
    System.out.println(Arrays.toString(arr4));
    System.out.println("В этом масиве наибольшее число - "+amax+", наименьшее число - "+amin+".\n Задача 6. Рассмотрим этот массив:");
    System.out.println(Arrays.toString(arr4));
    System.out.print ("В этом массиве есть место, где левая и правая часть равны: "+balanceCheck(arr4)+"\n Задача 7. Смещаем этот массив. На сколько единиц будем смещать? ");
    Scanner scan=(new Scanner(System.in));
    int n = scan.nextInt();
    System.out.println(Arrays.toString(displacement(arr4, n)));
    }
    private static boolean balanceCheck(int[] arr) {
        int lSum;
        int rSum;
        for (int i = 0; i < arr.length + 1; i++) {
            lSum = 0;
            rSum = 0;
            for (int j = 0; j < i; j++) {
                lSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rSum += arr[j];
            }
            if (lSum == rSum) return true;
        }
        return false;
    }
    private static int[] displacement(int[] arr, int displ){
        int[] arrDispl=new int [arr.length];
        for(int i=0; i<arr.length; i++){
            arrDispl[i]=arr[i];
        }
        return arrDispl;

    }
}

