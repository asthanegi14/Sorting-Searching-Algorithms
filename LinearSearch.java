import java.util.Scanner;

public class LinearSearch{
    public static int search(int n, int x, int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(x==arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String arg[]) {
        System.out.println("\nCode by: ASTHA NEGI");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many test cases: ");
        int t = sc.nextInt();
        while(t>0)
        {
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int i = 0;
        System.out.print("Enter array elements: ");

        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int x = sc.nextInt();
        int res = search(n, x ,arr);
        if(res!=-1)
            System.out.println("Number "+x+" found at index " + res);
        else
            System.out.println("Number not found at any index.");
        t--;
    }
    }
}
