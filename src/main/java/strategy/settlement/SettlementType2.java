package strategy.settlement;

public class SettlementType2 implements Settlement {

    @Override
    public void doSettlement() {
        System.out.println("Settlement Type2으로 처리");
    }
}
