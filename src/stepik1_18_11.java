import java.util.Scanner;
import java.util.ArrayList;


//Напишите программу, которая реализует структуру данных очередь, используя список.
//
//        Условие задачи таково: пользователь листает список музыки и добавляет в плейлист понравившиеся ему композиции. Когда песня доигрывает,
//        включается следующая. Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.
//
//        Сначала вводится число n - количество запросов к вашей программе. Каждый из запросов будет иметь один следующих видов:
//
//        push <Название трека> - добавляет трек в плейлист
//        pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
//        После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.
//
//        Sample Input:
//
//        4
//        push Трек1
//        push Трек3
//        pop
//        push ТрекТрек
//        Sample Output:
//
//        воспроизводится Трек1
//        Трек3 ТрекТрек


public class stepik1_18_11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); //кол-во запросов
        sc.nextLine();
        String str;
        ArrayList<String> myList = new ArrayList<>();
        for (int i=0;i<n;i++){
            str=sc.nextLine();
            if (str.contains("push")){
                str=str.replace("push ","");
                myList.add(str);
            } else if (str.contains("pop")) {
                System.out.println("воспроизводится " + myList.get(0));
                myList.remove(0);
            }
        }
        System.out.println(String.join(" ",myList));
    }
}

