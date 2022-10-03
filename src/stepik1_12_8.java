import java.util.Scanner;

//Вводится список (сначала количество элементов, потом сами элементы).
// Найдите сумму всех элементов и выведите её. А потом выведите введённые числа в обратном порядке.

public class stepik1_12_8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] myArr=new int[n];
        int sum=0;
        for(int i=0;i< myArr.length;i++){
            myArr[i]=sc.nextInt();
            sum+=myArr[i];
        }
        System.out.println(sum);
        for(int i= myArr.length-1;i>= 0;i--){
            System.out.println(myArr[i]);
        }
    }
}
