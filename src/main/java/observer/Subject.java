package observer;

import java.util.HashSet;
import java.util.Set;

// desc 5: Observer들에게 통지하는 일을 담당할 추상 클래스를 추가한다.
public abstract class Subject {

    // desc 6: 통지할 대상 Observer의 목록을 관리하는 필드를 추가한다.
    private Set<Observer> observers = new HashSet<>();

    // desc 7: 통지 대상 Observer 목록을 변경할 수 있도록 add, remove 메서드를 추가한다.
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    // desc 8: 이벤트 발생 시 Observer에게 통지할 메서드를 구현한다.
    public void publish(int dataChangedByEvent) {
        observers.stream().forEach(observer -> observer.subscribe(dataChangedByEvent));
    }
}
