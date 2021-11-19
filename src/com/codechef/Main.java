package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Insertion in an array, inserting an element in a particular position in an array.
	*/
Scanner sc = new Scanner(System.in);
int size,pos,ele;
size = sc.nextInt();
int[] arr = new int[size];
for(int i=0;i<size;i++){
    arr[i] = sc.nextInt();
}
pos = sc.nextInt();
ele = sc.nextInt();
for (int i=size-1;i>=pos-1;i--){
    arr[i]=arr[i-1];
}
arr[pos-1] = ele;
size++;
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
    }
}
