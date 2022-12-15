package bridge;

import bridge.ui.OutputView;
import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private Player player = new Player();
    private BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
    private List<String> bridge;
    public void start() {
        generateBridge();
        do{
            player.increaseTotalTryCount();
            player.resetPresentPosition();
            play();
        }while(!isFinished() && retry());

        OutputView.printFinalResult();
        OutputView.printMap(bridge, player.getPresentPosition(), player.getPresentPosition() == bridge.size());
        OutputView.printFinalSuccessResult(player.getPresentPosition() == bridge.size());
        OutputView.printTotalTryCount(player.getTotalTryCount());
    }

    private void generateBridge() {
        int bridgeSize = player.enterBridgeSize();
        List<String> bridge = new ArrayList<>();
        for(int i = 0; i < bridgeSize; i++){
            int generatedNumber = bridgeRandomNumberGenerator.generate();
            System.out.println(generatedNumber);
            if(generatedNumber == 0)
                bridge.add("D");
            if(generatedNumber == 1)
                bridge.add("U");
        }
        this.bridge = bridge;
    }

    private boolean isFinished() {
        if(player.getPresentPosition() == bridge.size())
            return true;
        return false;
    }

    public void play(){
        boolean canGo;
        do{
            canGo = move();
            OutputView.printMap(bridge, player.getPresentPosition(), canGo);
            if(canGo)
                player.goAhead();
        }while(canGo && !isFinished());
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move() {
        String playerDirection = player.enterDirection();
        if(bridge.get(player.getPresentPosition()).equals(playerDirection))
            return true;
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean retry() {
        return player.retry();
    }


}
