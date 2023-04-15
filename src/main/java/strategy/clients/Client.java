package strategy.clients;

import strategy.settlement.Settlement;

// desc 3: 인터페이스화한 비지니스 행위를 수행하는 주체들에 대한 추상화 클래스를 생성한다.
public abstract class Client {

    // desc 4: 인터페이스를 참조할 수 있는 필드를 추가한다.
    private Settlement settlement;

    public Client(Settlement settlement) {
        this.settlement = settlement;
    }

    // desc 5: 비지니스 행위를 호출할 메서드를 구현한다.
    public void doSettlement() {
        settlement.doSettlement();
    }
}
