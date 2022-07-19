import java.util.Scanner;

public class BinarySearch {
    public static int leftsearch(int x, int[] arr){
        for(int i = 0; i < arr.length/2; i++)
        {
            if(x==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static int rightsearch(int x, int[] arr){
        for(int i = arr.length/2; i < arr.length; i++)
        {
            if(x==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        System.out.println("\nCode by: ASTHA NEGI");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many test cases: ");
        int t = sc.nextInt();
        while(t>0) {
            System.out.print("Enter size of the array: ");
            int n = sc.nextInt();
            int i, ans = 0;
            int[] arr = new int[n];

            System.out.print("Enter array elements in sorted form: ");
            for (i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            System.out.print("Enter the number to be searched: ");
            int x = sc.nextInt();

            if (x == arr[n / 2]) {
                ans = n / 2;
            } else if (x < arr[n / 2]) {
                ans = leftsearch(x, arr);
            } else if (x > arr[n / 2]) {
                ans = rightsearch(x, arr);
            }
            if (ans != -1)
                System.out.println("Found at index " + ans);
            else
                System.out.println("Not found.");
            t--;
        }
    }
}
