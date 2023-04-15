package state;

// desc 1: 다양한 상태를 추상화한 인터페이스를 생성한다.
public interface LightState {

    // desc 2: 각각의 상태에서 일어날 수 있는 동작을 메서드로 정의한다.
    void doOn(Light light); // desc 3: 동작이 일어났을 때 상태를 갖는 주체의 상태를 변경해줘야하므로 파라미터로 상태의 주체 객체를 설정해준다.

    void doOff(Light light);
}
