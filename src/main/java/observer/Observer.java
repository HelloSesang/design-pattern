package observer;

// desc 1: 여러 이벤트 관찰자들을 추상화한 인터페이스를 작성한다.
public interface Observer {

    // desc 2: 각 구현체들이 이벤트의 값을 전달받아서 처리하는 로직을 구현할 추상 메서드를 추가한다.
    void subscribe(int dataChangedByEvent);
}
