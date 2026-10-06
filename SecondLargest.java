import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int n= sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        int largest=numbers[0];
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[largest]){
                largest=i;
            }
        }
        System.out.println(numbers[largest]);
    }
}
//if array is sorted then-> for(int i=0;i<numbers.length-1;i++);System.out.println(numbers[largest]);
//if array is not sorted-> for(int i=0;i<numbers.length-1;i++){;System.out.println(numbers[largest-1]);
