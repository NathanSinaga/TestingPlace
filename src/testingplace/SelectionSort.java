/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingplace;

/**
 *
 * @author Nathan Sinaga
 */
public class SelectionSort {

    public static int[] selectionSort(int[] arr){
        for(int x = 0; x < arr.length -1; x++){
            int min = x;
            for(int i = x; i < arr.length; i++){
                if(arr[min] > arr[i]){
                    min = i;
                }
            }
            int temp = arr[x];
            arr[x] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    
    public static int[] bubbleSort(int arr[]){
        for(int x = 0; x < arr.length; x++){
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArr(int[] arr){
        //System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("\n==================");
    }
    public static void main(String[] args) {
        int arr[] = {7,5,6,4,8,1,3,4,2,0};
        System.out.println("Array Awal: \n");
        printArr(arr);
        System.out.println("Array Selection Sort: \n");
        printArr(selectionSort(arr));
        System.out.println("Array Bubble Sort: \n");
        printArr(bubbleSort(arr));
    }
    
}
