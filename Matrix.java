import java.util.Scanner;
public class Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows=sc.nextInt();
        System.out.println("Enter coloumns");
        int coloumns=sc.nextInt();
        int[][] matrix=new int[rows][coloumns];
        System.out.println("Enter elements in matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloumns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
       System.out.println(" coloumn");
       for(int i=0;i<rows;i++){
        System.out.println(matrix[i][0]+"");
       }
       System.out.println("row");
       for(int j=0;j<coloumns;j++){
        System.out.println(matrix[0][j]+"");
       }
       System.out.println("Diagonal1:");
       for(int i=0;i<rows;i++){
        System.out.println(matrix[i][i]+"");
       }
       System.out.println("Diagonal2");
       for(int i=0;i<rows;i++){
        System.out.println(matrix[i][2-i]+"");
       }

}
}