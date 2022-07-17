import java.util.Scanner;

public class InsertionSort {
    public static void insertion(int[] a, int n) {
        int shift = 0, com=0;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                shift++;
                j--;
            }
            a[j + 1] = key;
            com++;
        }
        System.out.print("sorted array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.println("Comparison: "+com);
        System.out.print("Shift: " + shift);
    }
    public static void main(String arg[])
    {
        System.out.println("\nCode by: ASTHA NEGI");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many test cases: ");
        int t = sc.nextInt();
        while(t>0) {
            System.out.print("\nenter array length: ");
            int n = sc.nextInt();
            System.out.print("enter array elements: ");
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            insertion(a,n);
            t--;
        }
    }
}
