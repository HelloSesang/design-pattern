package decorator;

// desc 3: 기본 기능 및 옵션 기능을 모두 포괄하는 최상위 추상 클래스를 상속하도록 기본 기능 클래스를 생성한다.
public class DefaultDisplay extends Display {

    // desc 4: 최상위 추상 클래스의 메서드를 오버라이딩해서 기본 기능의 동작을 구현해준다.
    @Override
    void draw() {
        System.out.println("기본 기능 동작");
    }
}
