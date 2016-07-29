import java.io.*;
import java.util.*;
public class Revnum{

     public static void main(String []args){
       int rev=0;
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        
        while(num>0)
        {
            rev=num%10;
            num=num/10;
            System.out.print(rev);
        }
       
     }
}