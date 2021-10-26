import java.util.Scanner;
class BinarySearch
{
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

        System.out.println("Found at index: "+bsearch(a, 0, n-1, data));

        sc.close();
    }

    public static int bsearch(int a[], int l, int h, int data)
    {
        int mid=0;

        while(l<=h)
        {
            mid=(l+h)/2;

            if(a[mid]==data)
            return mid;

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