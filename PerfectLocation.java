public class PerfectLocation {

    public static int perfectLocation(int a[], int data)
    {
        int l=0, h=a.length;
        int mid=-1;

        while(l<h)
        {
            mid=(l+h)/2;

            if(a[mid]<=data)
            l=mid+1;

            else
            h=mid;
        }

        return h;
    }
    
}
