import java.util.Scanner;
import java.util.HashSet;


//Вводится число n, затем n целых чисел. Определите, сколько различных чисел было введено.
//        Sample Input:
//        7
//        1 1 2 2 2 3 3
//        Sample Output:
//        3

public class stepik1_19_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hSet=new HashSet<>();
        int n=sc.nextInt();
        for (int i=0; i<n; ++i){
            hSet.add(sc.nextInt());
        }
        System.out.println(hSet.size());
    }
}