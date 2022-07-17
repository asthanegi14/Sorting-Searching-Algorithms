import java.util.*;
class MergeSort
{
    public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int i;
        System.out.println("\nCode by: ASTHA NEGI, SECTION: J, ROLL NO: 16");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many test cases: ");
        int t = sc.nextInt();
        while(t>0) {
            System.out.print("enter no. of elements in array: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("enter array elements: ");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sort(a, 0, a.length - 1);

            System.out.println("\nSorted array");
            printArray(a);
            t--;
        }
    }
}
