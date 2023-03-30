package ch29;

public interface Queue {

    void enQueue(String title);
    // queue가 제공하는 여러 메서드 중 하나이며 array가 있다고 했을 때 맨 뒤로 들어가는 기능

    String deQueue();
    // 맨 앞에 있는 것을 반환
    // 이 책장은 앞에서 책이 나오고 맨 뒤에 책이 쌓이는 구조

    int getSize();
    // 책이 몇권이 있는지를 보기 위해서


}
