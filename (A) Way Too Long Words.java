import java.util.Scanner;
public class problem71A
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        double length=sc.nextInt();
        String str=null;
        for(int i=0;i<=length;i++){
            str=sc.nextLine();
            if(str.length()>10){
            System.out.print(str.charAt(0));
			System.out.print(str.length()-2); 
			System.out.println(str.charAt(str.length()-1));
            }
            else
            System.out.println(str);
        }
    }
}