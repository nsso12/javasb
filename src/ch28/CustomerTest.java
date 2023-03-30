package ch28;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.buy();
        customer.sell();

        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.order();

        // 객체가 여러 인터페이스를 임플리먼츠 했다라고 해도 이 객체가 구현한 인터페이스를
        // 외부에 어떤것으로 노출하느냐에 따라서 클라이언트 쪽에서 사용을 제한할 수 있음
        // Customer가 두 개를 모두 임플리먼츠 했지만 어떤 고객에게는 buy라는 인터페이스만 써라 sell이라는 인터페이스만 써라 라고 알려줄 수 있음
        // 그럼 사용하는 클라이언트 코드 입장에서는 오픈된 인터페이스만 사용할 수 있음
    }
}
