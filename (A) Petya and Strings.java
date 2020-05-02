import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class inter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int flag=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i))
                continue;
            else if(s1.charAt(i)<s2.charAt(i)){
                flag=-1;
                break;
            }
            else{
                flag=1;
                break;
            }
        }
        System.out.println(flag);
    }
}