package state;

public class On implements LightState {
    private static On on = new On();

    public static On getInstance() {
        return on;
    }

    @Override
    public void doOn(Light light) {
        System.out.println("아무 반응 없음");
    }

    @Override
    public void doOff(Light light) {
        light.setLightState(Off.getInstance());
        System.out.println("불 꺼짐");
    }
}
