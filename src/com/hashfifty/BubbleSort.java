package com.hashfifty;

public class BubbleSort {
    static void bubbleSortOne(int[] arr) {

        System.out.println("Bubble Sorting in progress \n");

        //int n = arr.length;

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < (arr.length - i - 1); j++) {

                if (arr[j] > arr[j+1]) {
                    //swap elements
                    temp = arr[j +1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println("Bubble Sorting Completed\n");
    }

    static void bubbleSortTwo(int[] arr) {

        System.out.println("Bubble Sorting in progress \n");

        for (int i=1; i < arr.length; i++){
            for(int j=0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j +1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println("Bubble Sorting Completed\n");
    }
}
