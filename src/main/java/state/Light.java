package state;

// desc 8: 상태를 갖는 주체 클래스를 작성한다.
public class Light {

    // desc 9: 현재 자신의 상태를 참조할 수 있는 필드를 선언한다.
    private LightState lightState;

    // desc 10: 초기 상태는 생성자에서 설정해준다.
    public Light() {
        this.lightState = Off.getInstance();
    }

    // desc 11: 상태 변경 처리를 위한 Setter를 추가해준다.
    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }

    // desc 12: 동작이 일어났을 때의 처리를 상태 객체에게 위임한다.
    public void doOn() {
        lightState.doOn(this); // desc 13: 상태 객체에서 상태 변경을 시켜주도록 자기 자신을 argument로 보낸다.
    }

    public void doOff() {
        lightState.doOff(this);
    }
}
