package bridge.ui;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {
    private static final String PRINT_FINAL_RESULT = "최종 게임 결과";
    private static final String FINAL_RESULT_SUCCESS = "게임 성공 여부: 성공";
    private static final String FINAL_RESULT_FAIL = "게임 성공 여부: 실패";
    private static final String TOTAL_TRY_COUNT = "총 시도한 횟수: ";


    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printMap(List<String> bridge, int playerPosition, boolean correctOrNot) {
        System.out.println("맵 출력");
        // 위쪽 라인 출력
        System.out.print("[ ");
        for(int i = 0; i < playerPosition; i++){
            if (bridge.get(i).equals("U")) {
                System.out.print("O | ");
            }
            if (bridge.get(i).equals("D")) {
                System.out.print("  | ");
            }
        }
        if(correctOrNot){
            if(bridge.get(playerPosition).equals("U"))
                System.out.print("O ]");
            if(bridge.get(playerPosition).equals("D"))
                System.out.print("  ]");
        }
        if(!correctOrNot) {
            if(bridge.get(playerPosition).equals("U"))
                System.out.print("  ]");
            if(bridge.get(playerPosition).equals("D"))
                System.out.print("X ]");
        }
        System.out.println();
        // 아래쪽 라인 추력
        System.out.print("[ ");
        for(int i = 0; i < playerPosition; i++){
            if (bridge.get(i).equals("D")) {
                System.out.print("O | ");
            }
            if (bridge.get(i).equals("U")) {
                System.out.print("  | ");
            }
        }
        if(correctOrNot){
            if(bridge.get(playerPosition).equals("U"))
                System.out.print("  ]");
            if(bridge.get(playerPosition).equals("D"))
                System.out.print("O ]");
        }
        if(!correctOrNot) {
            if(bridge.get(playerPosition).equals("U"))
                System.out.print("X ]");
            if(bridge.get(playerPosition).equals("D"))
                System.out.print("  ]");
        }
        System.out.println();

    }

    public static void printFinalResult() {
        System.out.println(PRINT_FINAL_RESULT);
    }

    public static void printFinalSuccessResult(boolean isSuccess) {
        if(isSuccess)
            System.out.println(FINAL_RESULT_SUCCESS);
        if (!isSuccess) {
            System.out.println(FINAL_RESULT_FAIL);
        }
    }

    public static void printTotalTryCount(int totalTryCount) {
        System.out.println(TOTAL_TRY_COUNT + totalTryCount);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }
}
