
public class Twopairsum
{
    public static void main(String[] args)
    {
        int arr[]={3,2,1,4,5,6,4};
        int k=30;
        int l=0;
        int h=arr.length-1;
        boolean g=false;
        while(l<=h)
            {
                int s=arr[l]+arr[h];
                if(s==k)
                {
                g=true;
                break;
                }
                else if(s<k)
                {
                    l++;
                }
                else{
                    h--;
                }
            }
            System.out.println(g);
    }
}