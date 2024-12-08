import java.util.*;
public class Postfixsum 
{
 public static void main(String[] args)
 {
    int arr[]={1,7,5,8,12,22,11};
    int post[]=new int[arr.length];
    post[0]=arr[0];
     for(int i=1;i<arr.length;++i)
     post[i]=post[i-1]+arr[i];
     System.out.println(Arrays.toString(post));
 }
}