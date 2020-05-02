import java.util.Scanner;
public class problem118A
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        char[] ch=new char[100];
        char[] v={'a','e','i','o','u','y'};
        String str=sc.next().toLowerCase().replaceAll("[aeiouyAEIOUY]","");
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            s.append(".");
            s.append(str.charAt(i));
        }
        System.out.println(s);
    }
}