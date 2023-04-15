package strategy.clients;

import strategy.settlement.Settlement;

// desc 6: 비지니스 수행 주체에 대한 구현체를 정의한다.
public class Kakao extends Client {

    // desc 7: 구현체에서 사용할 비지니스 행위를 선택해서 주입할 수 있도록 한다.
    public Kakao(Settlement settlement) {
        super(settlement);
    }
}
