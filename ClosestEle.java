import java.util.Scanner;
public class ClosestEle {

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

        System.out.println("Found at index: "+closest(a, data));

        sc.close();
    }

    public static int closest(int a[], int data)
    {
        int mid=0;
        int l=0, h=a.length-1;

        if(data<a[l])
        return a[l];

        else if(data>a[h])
        return a[h];

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
        
        return data-a[h]<a[l]-data?a[h]:a[l];

}
