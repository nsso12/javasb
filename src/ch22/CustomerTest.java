package ch22;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new GoldCustomer(10010, "이지민");
        Customer customerSon = new VIPCustomer(10020,"손진경" , 122400);
        Customer customerKim = new Customer(10030, "김효정");
        Customer customerAnn = new GoldCustomer(10040, "안성민");
        Customer customerNam = new Customer(10050, "남소현");

        customerList.add(customerLee);
        customerList.add(customerSon);
        customerList.add(customerKim);
        customerList.add(customerAnn);
        customerList.add(customerNam);

        System.out.println();
        System.out.println("======== 고객 정보 출력 =========");

        for( Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println();
        System.out.println("========= 할인율과 보너스 포인트 계산 =========");

        int price = 10000;
        for(Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다" );
        }

    }
}
