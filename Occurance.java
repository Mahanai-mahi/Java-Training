import java.util.Scanner;
public class Occurance {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elements");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0;i<n;i++){
            numbers[i]= sc.nextInt();
        }
        int key=1;
        int count=0;
        for(int i=0;i<n;i++){
            if(numbers[i]==key){
                count++;
                
            }
           
        }
         System.out.println("COunt="+count);
    }
}
