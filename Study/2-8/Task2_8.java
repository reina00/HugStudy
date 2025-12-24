/**
* Task2-8 : 課題内容
*
* 本課題では、演算子の使い方を学んでいきましょう。
* 問①から問⑦まであります。
* 指定された数値、式、変数名を守って記述して下さい。
*
* 問③,⑤については、コメントを入れて下さい。
* 問⑦については、変数名を使って出力して下さい。
*
*/
public class Task2_8 {




    public static void main(String[] args) {




    // ① 5 と 16 を加算した値を代入する、変数 plus を作成して下さい。
    int a = 5;   
    int b =16;
    int  plus = a+b;





    // ② 27 から 7 を減算した値を代入する、変数 minus を作成して下さい。
    int c = 27;   
    int d =7;
    int  minus = c-d;


    // ③下記の処理について、何をしているのかコメントを記入して下さい。
    // [変数multiplyに10×2の計算した値を代入にしている]
    int multiply = 10 * 2;




    // ④ 20 を 6 で割った余りを代入する、変数 remi を作成して下さい。
    int e = 20;   
    int f = 6;
    int  remi = e%f;


    // ⑤下記の処理について、何をしているのかコメントを記入して下さい。
    // [Stringクラスで宣言して変数名townを中央で初期化、変数名lineを線で初期化している]
    String town = "中央";
    String line = "線";




    // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成して下さい。
String train =town + line;



    // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力して下さい。

System.out.println(plus);
System.out.println(minus);
System.out.println(multiply);
System.out.println(remi);
System.out.println(train);



    }
}