package bridge;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BridgeGame bridgeGame = new BridgeGame();
        try{
            bridgeGame.start();
        }catch(IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());
        }
    }
}
