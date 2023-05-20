import java.util.*;
public class Program
{
    public static boolean checkstring(String s){
        int len=s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                System.out.println(s.charAt(len-i-1));
                return false;
                //break;
            }
        }
        return true;
    }
    public static boolean checknum(int num){
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        if(num==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Program p =new Program();
        System.out.println("1.NO 2.ST");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Ener no");
            int num=sc.nextInt();
            System.out.println("the number is palindrome?"+p.checknum(num));
        }
        else if(choice==2){
            System.out.println("Enter String");
            String str=sc.next();
            System.out.println("the string is palindrome?"+p.checkstring(str));
        }
        else{
            System.out.println("invalid");
        }
	}
}