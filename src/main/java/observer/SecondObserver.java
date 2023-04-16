package observer;

public class SecondObserver implements Observer {

    @Override
    public void subscribe(int dataChangedByEvent) {
        System.out.println(dataChangedByEvent + "를 받았다.");
        System.out.println("나는 저런거 해야지");
    }
}
