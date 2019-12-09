package paymethod;

public class Weixin extends PayAccess {
    @Override
    public String getName() {
        //设置支付类型：微信
        return "微信";
    }

    @Override
    public double querybalance(String paytype) {
        //设置微信余额1000
        return 1000;
    }
}
