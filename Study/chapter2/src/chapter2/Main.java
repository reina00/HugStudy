
package chapter2;

public class Main {
    public static void main(String[] args) {
        Person pepe = new Person("ぺぺ", 3);
        pepe.name = "ミケ"; //不正な代入
        pepe.showName();
        pepe.showAge();
    }
}