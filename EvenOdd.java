import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int n=sc.nextInt();
        switch(n%2){
            case 0:
                System.out.println("Its even"+n);
                break;
            case 1:
                System.out.println("Odd"+n);
                break;
            default:
                System.out.println("NO");
        }
    }
}
