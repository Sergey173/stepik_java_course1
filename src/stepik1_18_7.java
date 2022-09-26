import java.util.Scanner;
import java.util.ArrayList;


/*
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m.
Выведите список на экран через пробел.

        Sample Input:

        5
        2
        Строка
*/


public class stepik1_18_7 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> myArrList=new ArrayList<>();
        myArrList.add(1);
        myArrList.add(1);
        for (int i=0; i<n; i++ ){
            myArrList.add(1,0);
        }
        System.out.print(String.join("/",String.valueOf(myArrList)));
    }
}
