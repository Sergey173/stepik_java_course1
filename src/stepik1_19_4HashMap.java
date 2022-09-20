
import java.util.HashMap;
import java.util.Scanner;


//Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
//Для слова из словаря, записанного в последней строке, определите его синоним.
//Вводится число n. Затем 2*n строк. И Ещё одна строка - синоним для которой нужно вывести.
//        Sample Input:
//        3
//        Hello
//        Hi
//        Bye
//        Goodbye
//        List
//        Array
//        Goodbye
//        Sample Output:
//        Bye

public class stepik1_19_4HashMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String, String> myHMap =new HashMap<>();
        int n = sc.nextInt();
        sc.next();
        String str1;
        String str2;
        for(int i=0;i<n;++i){
            str1=sc.nextLine();
            str2=sc.nextLine();
            myHMap.put(str1,str2);
            myHMap.put(str2,str1);
        }
        String strRequest=sc.nextLine();
        System.out.println(myHMap.get(strRequest));
    }
}
