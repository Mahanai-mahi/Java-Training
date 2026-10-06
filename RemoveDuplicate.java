import java.util.Scanner;
public class RemoveDuplicate {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int n = sc.nextInt();
    int[] numbers=new int[n];
    System.out.println("Enter elements:");
    for(int i=0;i<numbers.length;i++){
        numbers[i]=sc.nextInt();
    } 
      System.out.println("After removing duplicates:");

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
   } 
}
