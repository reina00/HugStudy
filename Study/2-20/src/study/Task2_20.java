package study;

public class Task2_20 {

    public static void main(String[] args) {
        //④子クラスを元にしたインスタンスを作成して下さい。(インスタンス名：child)
    
        Child aa = new Child();
        //⑤インスタンスchildでcallNameメソッドを呼び出して下さい。
        aa.callName();
        
        //⑥インスタンスchildでupdateメソッドを呼び出して下さい。
        aa.update();
        
        //⑦オーバーロードされたargumentメソッドを呼び出し解答画像になるように出力して下さい。
        aa.argument();
        aa.argument(1);
        aa.argument(2);
    }

}