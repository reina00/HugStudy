package chapter2;

public class Human {
    private String name;
    private int age;
    private String phoneNumber;

    public Human(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void status() {
        System.out.println("nameは" + this.name + "で初期化されました。");
        System.out.println("ageは" + this.age + "で初期化されました。");
        System.out.println("phoneNumberは" + this.phoneNumber + "で初期化されました。");
    }
}