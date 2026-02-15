package chapter2;
class Car extends Vehicle {

    public void startCar() {
        super.startEngine(); // 親クラスのstartEngineメソッドを呼び出す
    }
}
