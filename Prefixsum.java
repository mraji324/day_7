import java.util.*;
public class Prefixsum 
{
 public static void main(String[] args)
 {
    int arr[]={1,7,5,8,12,22,11};
    int pre[]=new int[arr.length];
    pre[0]=arr[0];
     for(int i=1;i<arr.length;i++)
     pre[i]=pre[i-1]+arr[i];
     System.out.println(Arrays.toString(pre));
 }
}