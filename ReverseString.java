import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println("Enter");
        String reverse="";
        for(int i=n.length()-1;i>=0;i--){
            reverse+=n.charAt(i);
        }
        System.out.println(reverse);
    }
}
