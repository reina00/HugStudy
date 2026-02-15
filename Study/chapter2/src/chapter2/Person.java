package chapter2;

public class Person {
    //======パラメータ======
    private String name; //なまえ
    private int gender; //性別(1:男　2:女)
    private int length; //身長
    private int weight; //体重
    private String skill; //特技
    private String hobby; //趣味

    //コンストラクタ
    public Person() {
        this.name = "山田太郎";
        this.gender = 1;
        this.length = 180;
        this.weight = 80;
        this.skill = "缶蹴り";
        this.hobby = "鬼ごっこ";
    }

    //======操作======
    //遊びメソッド
    public void play() {
        System.out.println(this.name + "は遊びにいってきます！");
    }
    //休憩メソッド
    public void rest() {
        System.out.println(this.name + "は" + this.hobby + "をして休憩しています。");
    }
    //特技getterメソッド
    public String skill() {
        return this.skill;
    }
}
