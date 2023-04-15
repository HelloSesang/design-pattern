package state;

// desc 0: 형광등이 상태에 따라 다르게 동작하는 것을 표현했다.
public class Person {

    public static void main(String[] args) {
        Light light = new Light();
        light.doOff();
        light.doOn();
        light.doOn();
    }
}
