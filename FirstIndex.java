import java.util.Scanner;
public class FirstIndex {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter no. of elements: ");
        int n=sc.nextInt();

        System.out.println("enter elements: ");
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        System.out.println("enter data to be searched: ");
        int data=sc.nextInt();
    }

    public static int findFirstIndex(int a[],int n, int data)
    {
        int l=0, h=n-1;

        int mid=0;

        while(l<=h)
        {
            mid=(l+h)/2;

            if(a[mid]==data)
            {
                h=mid-1;
            }
            
            else if(data<a[mid])
            {
                h=mid-1;
            }
            else if(data>a[mid])
            {
                l=mid+1;
            }
        }
        return -1;
    }
}
