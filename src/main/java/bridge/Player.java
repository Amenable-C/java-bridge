package bridge;

import bridge.ui.InputView;

public class Player {

    private int presentPosition = 0;
    private int totalTryCount = 0;
    public boolean retry() {
        String retryOrNotCommand = InputView.readRetryOrNot();
        if(retryOrNotCommand.equals("R")){
            return true;
        }
        if(retryOrNotCommand.equals("Q"))
            return false;
        throw new IllegalArgumentException("[ERROR]");
    }

    public int enterBridgeSize() {
        return InputView.readBridgeSize();

    }

    public String enterDirection() {
        return InputView.readDirection();
    }

    public int getPresentPosition() {
        return presentPosition;
    }

    public void goAhead() {
        this.presentPosition += 1;
    }

    public void resetPresentPosition() {
        this.presentPosition = 0;
    }

    public void increaseTotalTryCount() {
        this.totalTryCount++;
    }

    public int getTotalTryCount() {
        return totalTryCount;
    }
}
