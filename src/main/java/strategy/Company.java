package strategy;

import strategy.clients.Kakao;
import strategy.clients.Line;
import strategy.clients.Naver;
import strategy.clients.Nhn;
import strategy.settlement.SettlementType1;
import strategy.settlement.SettlementType2;

// desc 0: 내가 다니는 회사가 고객사의 정산을 대신하는 회사인데 회사마다 정산 방법이 다른 경우를 가정한다.
public class Company {

    public static void main(String[] args) {
        // desc 8: 각 고객사에 맞는 정산 방법을 주입하고 정산 처리를 실행시켜주면 전략에 맞게 동작한다.
        Kakao kakao = new Kakao(new SettlementType1());
        kakao.doSettlement();

        Line line = new Line(new SettlementType1());
        line.doSettlement();

        Naver naver = new Naver(new SettlementType2());
        naver.doSettlement();

        Nhn nhn = new Nhn(new SettlementType2());
        nhn.doSettlement();
    }
}
