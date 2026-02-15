package kei;

public class LearnList {

    public static void main(String[] args) {
        // 配列の宣言をする
        int[] number = new int[5];
        // 宣言した配列の初期化をする
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        
        // 配列の最初の値を上書きする
        number[0] = 5;
        
         // 出力
        for(int i=0; i<number.length; i++) {
            System.out.println("配列：添え字" + i + "の値は" +  number[i]);
        }
    }
}
