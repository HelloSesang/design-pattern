package observer;

// desc 9: 이벤트가 발생할 객체를 작성한다. Observer에게 통지하는 기능을 사용하기 위해 Subject를 상속한다.
public class EventTarget extends Subject {

    // desc 10: 이벤트로 변경될 대상 값이 존재한다.
    private int dataChangedByEvent;

    // desc 11: 이벤트로 인해 값이 변경되면 값의 변경에 더해서 통지하는 기능까지 수행해준다.
    public void setDataChangedByEvent(int dataChangedByEvent) {
        this.dataChangedByEvent = dataChangedByEvent;
        this.publish(this.dataChangedByEvent);
    }
}
