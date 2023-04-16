package observer;

public class Main {

    // desc 12: 이벤트 대상에 Observer를 연결해준 이후 이벤트를 발생시킨다.
    public static void main(String[] args) {
        EventTarget eventTarget = new EventTarget();
        eventTarget.addObserver(new FirstObserver());
        eventTarget.addObserver(new SecondObserver());

        eventTarget.setDataChangedByEvent(1);
        eventTarget.setDataChangedByEvent(5);
        eventTarget.setDataChangedByEvent(10);
        eventTarget.setDataChangedByEvent(78);
    }
}
