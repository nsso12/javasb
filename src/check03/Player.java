package check03;

public class Player {

    private PlayerLevel level;
    public Player() {  // 비기너레벨이 기본 틀이라는걸까
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradelevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
