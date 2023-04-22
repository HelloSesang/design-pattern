package decorator;

// desc 5: 옵션 기능만을 추상화한 추상 클래스를 추가하고 최상위 추상 클래스를 상속받도록 해준다.
public abstract class DisplayDecorator extends Display {

    // desc 6: 다른 기능(기본 기능이든 옵션 기능이든)을 호출할 수 있도록 최상위 추상 클래스 필드를 추가해준다.
    private Display display;

    // desc 7: 참조할 기능을 생성자에서 주입할 수 있도록 해준다.
    public DisplayDecorator(Display display) {
        this.display = display;
    }

    // desc 8: 기능 수행 메서드에서 참조해야할 다른 기능을 호출하도록 구현해준다.
    @Override
    void draw() {
        this.display.draw();
    }
}
