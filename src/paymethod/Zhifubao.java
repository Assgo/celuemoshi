package paymethod;

public class Zhifubao extends PayAccess {
    @Override
    public String getName() {
        //返回支付方法，支付宝
        return "支付宝";
    }

    @Override
    public double querybalance(String paytype) {
        //设置支付宝余额500
        return 500;
    }
}
