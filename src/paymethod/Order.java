package paymethod;

/**
 * order:命令
 */
public class Order {
    private String paytype;     //支付类型
    private double itemprice;   //物价

    //有参构造
    public Order(String paytype, double itemprice) {
        this.paytype = paytype;
        this.itemprice = itemprice;
    }

    public MsgResult pay() {
        //从支付方式类里获取支付渠道
        PayAccess payAccess = PayStrategy.get(this.paytype);
        //获取支付方式
        System.out.println("支付方式：" + payAccess.getName());
        System.out.println("本次付款：" + this.itemprice + " 开始支付。。。。");
        return payAccess.pay(this.paytype, this.itemprice);
    }
}
