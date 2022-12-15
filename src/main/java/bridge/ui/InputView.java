package bridge.ui;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private static final String ENTER_BRIDGE_SIZE = "다리 길이를 입력하세요.";
    private static final String ENTER_DIRECTION = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    private static final String ENTER_RETRY_OR_NOT = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";

    /**
     * 다리의 길이를 입력받는다.
     */
    public static int readBridgeSize() {
        System.out.println(ENTER_BRIDGE_SIZE);
        return Integer.parseInt(readLine());
    }

    public static String readDirection() {
        System.out.println(ENTER_DIRECTION);
        return readLine();
    }

    public static String readRetryOrNot() {
        System.out.println(ENTER_RETRY_OR_NOT);
        return readLine();
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
