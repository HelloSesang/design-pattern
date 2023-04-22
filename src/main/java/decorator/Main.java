package decorator;

public class Main {

    public static void main(String[] args) {
        DefaultDisplay defaultDisplay = new DefaultDisplay();
        defaultDisplay.draw(); // desc: 기본 기능만 수행

        System.out.println("----------------");

        LaneDecorator laneDecorator = new LaneDecorator(defaultDisplay);
        laneDecorator.draw(); // desc: 기본 기능 + 옵션 기능 1개 수행

        System.out.println("----------------");

        TrafficDecorator trafficDecorator = new TrafficDecorator(laneDecorator);
        trafficDecorator.draw(); // desc: 기본 기능 + 옵션 기능 2개 수행
        // desc: 옵션 기능의 갯수가 3개, 4개로 늘어나더라도 동일한 방식으로 조합하여 수행하도록 할 수 있다.

        System.out.println("----------------");

        // desc 12: 기능의 조합을 동적으로 처리하는 것도 가능하다.
        boolean isLaneOptionOn = true;
        boolean isTrafficOptionOn = true;

        Display display = new DefaultDisplay();
        if (isLaneOptionOn) {
            display = new LaneDecorator(display);
        }
        if (isTrafficOptionOn) {
            display = new TrafficDecorator(display);
        }
        display.draw(); // desc: On된 옵션들만 조합되어 수행하게 된다.
    }
}
