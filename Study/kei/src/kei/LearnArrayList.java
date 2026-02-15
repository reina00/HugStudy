package kei;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {

        // 可変配列 ArrayListを宣言する
        // 要素数を指定しないで宣言する
        // 要素数を指定しない場合、要素数は10で自動的に生成される
        ArrayList<Integer> alNumber = new ArrayList<Integer>();
        // 要素数を5で宣言する
        ArrayList<Integer> alNumber_5 = new ArrayList<Integer>(5);

        // 可変配列alNumberの初期化と追加をする
        // 初期化と追加は同じaddメソッドを使用し値を格納していきます
        alNumber.add(1);
        alNumber.add(2);
        alNumber.add(3);
        alNumber.add(4);
        alNumber.add(5);
        alNumber.add(6);
        alNumber.add(7);
        alNumber.add(8);
        alNumber.add(9);
        alNumber.add(10);
        // 初期要素数は10ですが、要素数を超えてaddメソッドを使用すると
        // 自動的に要素数が増えていきます。
        alNumber.add(11);

        // 添え字を使用し0番目の要素を上書きする
        // 1 → 5 に上書き
        alNumber.set(0, 5);

        // 添え字を使用し0番目の要素を削除する
        alNumber.remove(0);

        // 出力
        for(int i=0; i<alNumber.size(); i++) {
            System.out.println("ArrayList：添え字" + i + "の値は" +  alNumber.get(i));
        }
    }


}
