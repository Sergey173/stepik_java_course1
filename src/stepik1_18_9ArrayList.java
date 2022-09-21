import java.util.ArrayList;
import java.util.Scanner;


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


public class stepik1_18_9ArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String>myArrList=new ArrayList<>();
        for (int i=0;i<n;++i){
            myArrList.add(String.valueOf(i));
        }
        int m=sc.nextInt();
        String str=sc.next();
        myArrList.set(m,str);

        System.out.print(String.join(" ",myArrList));
    }
}
