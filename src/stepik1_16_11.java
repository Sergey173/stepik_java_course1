import java.util.Scanner;


public class stepik1_16_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        for (int i=0; i< str.length;i++){
            str[i]=sc.nextLine();
        }
        String s6=sc.nextLine();
        //String str1= String.join(s6,str[0],str[1],str[2],str[3],str[4]);
        //System.out.print(str1);
        System.out.print(String.join(s6, str));
    }
}
