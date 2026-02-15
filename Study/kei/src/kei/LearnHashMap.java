package kei;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {
        // ▼コレクションフレームワーク
        // キーを利用する配列 HashMap
        // 宣言
        HashMap<String, String> hashMap = new HashMap<String, String>();
        // 初期化＆追加
        hashMap.put("apple", "りんご");
        hashMap.put("orange", "みかん");
        hashMap.put("grape", "ぶどう");
        hashMap.put("melon", "パイナップル");
        
        // 上書き
        hashMap.replace("melon", "メロン");
        
        // 削除
        hashMap.remove("apple");
        
        // 出力
        for(String key: hashMap.keySet()) {
            System.out.println("HashMap：キー" + key + "の値は" + hashMap.get(key));
        }
            
    }
}
