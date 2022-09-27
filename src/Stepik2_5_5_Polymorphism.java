public class Stepik2_5_5_Polymorphism {
    public static void main(String[] args) {
        Animal2 duck = new Animal2("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        duck.holiday();
        duck.display();

        duck.holiday(5);
        duck.display();

        duck.holiday(0.4);
        duck.display();

        duck.holiday(0.3, 2);
        duck.display();
    }
}


class Animal2 {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    //конструктор
    Animal2(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        this.type=type;
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.isFly=isFly;
        this.isWalk=isWalk;
        this.isSwim=isSwim;
    }

    void display() {
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", " +
                "Вес: " + String.format("%.1f",weight) + ", Умеет летать: " + (isFly?"Да":"Нет") + ", Умеет ходить: " +
                (isWalk?"Да":"Нет") + ", Умеет плавать: " + (isSwim?"Да":"Нет") + ".");
    }

    void rename(String newName) {
        this.name = newName;
    }

//    Перегрузите метод holiday() в классе Animal (из предыдущего урока) таким образом:
//
//    holiday() - увеличивает массу животного на 0.1
//    holiday(double m) - увеличивает массу животного на m
//    holiday(double m, int n) - n раз увеличивает массу животного на m

    void holiday() {
        this.weight += 0.1;
    }
    void holiday(double m) {
        this.weight += m;
    }
    void holiday(double m, int n) {
        this.weight += m*n;
    }
}