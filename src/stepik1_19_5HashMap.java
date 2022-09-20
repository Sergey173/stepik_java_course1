import java.util.HashMap;
import java.util.Scanner;


//Вводится натуральное число n, затем n слов на разных строках. Определите, какое слово встречается чаще всего.
//Гарантируется, что такое слово одно. Все слова вводятся в нижнем регистре на русском языке.
//        Sample Input 1:
//        6
//        да
//        я
//        прикалывался
//        просто
//        да
//        успокойся
//        Sample Output 1:
//        да

public class stepik1_19_5HashMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> myHMap =new HashMap<>();
        int n = sc.nextInt();
        int j;
        int mapMaxValue=1;
        sc.nextLine();
        String str1;
        for(int i=0;i<n;++i){
            str1=sc.nextLine();
            if (myHMap.containsKey(str1)){
                j=myHMap.get(str1);
                myHMap.put(str1, j+1);
                if (j+1>mapMaxValue) mapMaxValue=j+1;
            }else{
                myHMap.put(str1,1);
            }
        }
        for (String key: myHMap.keySet()){
            if(myHMap.get(key) == mapMaxValue) System.out.println(key);
        }
    }
}