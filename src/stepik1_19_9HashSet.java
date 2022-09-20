import java.util.HashSet;
import java.util.Scanner;

//Вводится число n, затем n целых чисел. Для каждого числа выведите слово YES (в отдельной строке),
// если это число ранее встречалось в последовательности или NO,  если не встречалось.
//        Sample Input:
//        6
//        1 2 3 2 3 4
//        Sample Output:
//        NO
//        NO
//        NO
//        YES
//        YES
//        NO

public class stepik1_19_9HashSet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1;
        HashSet<Integer> hSet=new HashSet<>();
        for (int i=0;i<n;++i){
            n1=sc.nextInt();
            if (hSet.add(n1)){
                hSet.add(n1);
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
