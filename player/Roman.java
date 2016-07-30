 import java.util.*;
 class Solution {

public int romanToInteger(String s) {
    if(s == null){
        return 0;
    }
    
    int len = s.length();
    int sum = 0;
    int previous = 0;
    
    for(int i = len - 1; i >= 0; i--){
        int cur = romanTable(s.charAt(i));
        
        if(i == len - 1){
            sum = sum + cur;
        }else{
           if(cur < previous){
               sum = sum - cur;
           }else{
               sum = sum + cur;
           }
        }
        previous = cur;
    }
    
    return sum;
}

public int romanTable(char c){
    int number = 0;
    switch(c){
        case 'I':
            number = 1;
            break;
        case 'V':
            number = 5;
            break;
         case 'X':
            number = 10;
            break;
         case 'L':
             number = 50;
             break;
         case 'C':
             number = 100;
             break;
         case 'D':
             number = 500;
             break;
         case 'M':
             number = 1000;
             break;
         default:
             number = 0;
             break;
    }
    return number;
}
}



public class Roman extends Solution
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        Scanner in=new Scanner(System.in);
        String rm=in.nextLine();
        int s1=s.romanToInteger(rm);
        System.out.println(s1);
    }
}