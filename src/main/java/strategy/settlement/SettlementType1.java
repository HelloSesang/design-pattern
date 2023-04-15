package strategy.settlement;

// desc 2: 인터페이스를 구현을 통해서 각각의 전략을 구체화한다.
public class SettlementType1 implements Settlement {

    @Override
    public void doSettlement() {
        System.out.println("Settlement Type1으로 처리");
    }
}
