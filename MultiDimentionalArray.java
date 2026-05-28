import java.util.Scanner;
public class MultiDimentionalArray{

    static void printArray(int [][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }

    public static void main(String[] args){
       //  int [][]arr=new int[3][3];

       /* int [][]arr2={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
         */ 
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int rows =sc.nextInt();
        System.out.print("enter the number of columns:");
        int cols=sc.nextInt();

        int[][] arr3=new int [rows][cols];
        System.out.println("enter  " + (rows*cols) + "  integers (row by row):");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr3[i][j]=sc.nextInt();
            }
        }
        sc.close();
        printArray(arr3);
    }
}































