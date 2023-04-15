package state;

// desc 4: 여러 상태 중 하나를 대표하는 구현체를 인터페이스를 상속받도록 구현한다.
public class Off implements LightState {

    // desc 5: 상태 객체를 매번 생성하지 않도록 싱글턴으로 사용가능하게 해준다.
    private static Off off = new Off();

    public static Off getInstance() {
        return off;
    }

    // desc 6: 현재 상태에서 어떤 동작이 일어났을 때의 반응 방식을 구현해준다.
    @Override
    public void doOn(Light light) {
        light.setLightState(On.getInstance()); // desc 7: 동작이 일어났을 때 상태가 변경되어야하는 경우 상태를 변경시켜준다.
        System.out.println("불 켜짐");
    }

    @Override
    public void doOff(Light light) {
        System.out.println("아무 반응 없음");
    }
}
