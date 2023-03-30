package check03;

public abstract class PlayerLevel {

    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public abstract void showLevelMessage();

    final public void go(int count) { //final이기 때문에 하위 클래스에서 오버라이딩 할 수 없음
        run();

        for (int j=0; j<count; j++) {
            jump();
        }
        turn();
    }
}
