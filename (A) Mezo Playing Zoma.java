import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class zoma{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int lcount=0;
        int rcount=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                lcount++;
            }
            else{
                rcount++;
            }
        }
        sum=lcount+rcount+1;
        System.out.println(sum);
    }
}