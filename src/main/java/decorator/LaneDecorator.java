package decorator;

// desc 9: 옵션 기능 클래스를 작성하는데 옵션 기능 추상 클래스를 상속받도록 한다.
public class LaneDecorator extends DisplayDecorator {

    // desc 10: 조합해야할 다른 기능 객체를 생성자에서 받도록 해준다.
    public LaneDecorator(Display defaultDisplay) {
        super(defaultDisplay);
    }

    // desc 11: 상위 클래스의 기능 수행 메서드를 호출해서 조합 대상 기능들이 수행되도록 한 이후 자신의 기능도 수행한다.
    @Override
    void draw() {
        super.draw();
        System.out.println("Lane 출력 기능 동작");
    }
}
