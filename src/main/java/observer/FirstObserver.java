package observer;

// desc 3: 이벤트 관찰자의 구현체를 추가한다.
public class FirstObserver implements Observer {

    // desc 4: 이벤트 발생을 통지받으면 해야할 일을 구현한다.
    @Override
    public void subscribe(int dataChangedByEvent) {
        System.out.println(dataChangedByEvent + "를 받았다.");
        System.out.println("나는 이런거 해야지");
    }
}
