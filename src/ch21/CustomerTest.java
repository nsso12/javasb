package ch21;

public class CustomerTest {
    public static void main(String[] args) {

//        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이지민");
//        customerLee.setCustomerId(10010);
//        customerLee.bonusPoint = 9999999;
//        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김효정");
//        customerKim.setCustomerName("김효정");
//        customerKim.setCustomerId(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

    }
}
