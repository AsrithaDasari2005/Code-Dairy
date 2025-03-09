import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static int ways(int N){
        if(N==1 || N==0 || N==2) return N;
        int mod=1000000007;
        int prev1=2, prev2=1, curr=0;
        for(int i=3;i<=N;i++){
            curr=(prev1+prev2)%mod;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(ways(N));
    }
}
