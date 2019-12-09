package paymethod;

public class PayItemTest {
    public static void main(String[] args) {
        //自定义支付方式
        String paytype = null;
        //实例化执行类
        Order order = new Order(paytype, 600);
        System.out.println(order.pay());
    }
}
