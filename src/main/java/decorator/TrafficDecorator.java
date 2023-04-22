package decorator;

public class TrafficDecorator extends DisplayDecorator {

    public TrafficDecorator(Display display) {
        super(display);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("트래픽 출력 기능 동작");
    }
}
