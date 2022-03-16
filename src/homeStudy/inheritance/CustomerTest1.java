package homeStudy.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setCustomerID(10010);
        customer.setCustomerName("이순신");
        customer.bonusPoint = 1000;
        System.out.println(customer.showCustomerInfo());

        VIPCustomer vipCustomer = new VIPCustomer();
        vipCustomer.setCustomerID(10020);
        vipCustomer.setCustomerName("홍길동");
        vipCustomer.bonusPoint = 1000;
        System.out.println(vipCustomer.showCustomerInfo());

    }
}
