package kei;

import java.util.HashSet;

public class LearnHashSet {

    public static void main(String[] args) {
        // ▼コレクションフレームワーク
        // 値の重複を許さない配列 HashSet
        // 宣言
        HashSet<Integer> hashSet = new HashSet<Integer>();
        // 初期化＆追加
        hashSet.add(5000);
        hashSet.add(10000);
        hashSet.add(15000);
        hashSet.add(20000);
        hashSet.add(25000);
        hashSet.add(5000);
        
        // 削除
        hashSet.remove(25000);
        
        // 出力
        for(Integer number: hashSet) {
            System.out.println("HashSet：値は" + number);
        }
    }

}
