package com.hashfifty; 

public class Main {

    public static void main(String[] args) {

        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Array Before The Sort\n");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

     //   BubbleSort.bubbleSortOne(arr);//sorting array elements using bubble sort
        BubbleSort.bubbleSortTwo(arr);


        System.out.println("Array After The Sort\n");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }




    }
}
