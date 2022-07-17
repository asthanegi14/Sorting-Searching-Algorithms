package daa_assignment;

import java.util.Scanner;

public class SelectionSort {
    public static void selection(int[] a, int n) {
        int swap = 0, com = 0;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j]) {
                    min = j;
                    swap++;
                }
            }
            int temp = a[min];
            a[min]=a[i];
            a[i]=temp;
            com++;
        }
        System.out.print("sorted array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.println("Comparison: "+com);
        System.out.print("Shift: " + swap);
    }

    public static void main(String arg[]) {
        System.out.println("\nCode by: ASTHA NEGI");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many test cases: ");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.print("\nenter array length: ");
            int n = sc.nextInt();
            System.out.print("enter array elements: ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            selection(a, n);
            t--;
        }
    }
}
