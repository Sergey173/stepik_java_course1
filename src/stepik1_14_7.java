import java.util.Scanner;

//Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения размером n*m через пробел.

public class stepik1_14_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int[][] arr2= new int[a][b];
        for (int i=0;i<arr2.length;i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int ii=0;ii<arr2.length;ii++){
            for (int jj=0; jj<arr2[0].length;jj++){
                if(jj==arr2[0].length-1)
                    System.out.println(arr2[ii][jj] + " ");
                else
                    System.out.print(arr2[ii][jj] + " ");
            }
        }
    }
}