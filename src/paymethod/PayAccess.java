package paymethod;

public abstract class PayAccess {
    //支付通道，两个抽象方法，一个方法

    //获取支付方法
    public abstract String getName();

    //获取余额
    protected  abstract  double querybalance(String paytype);

    //定义一个方法判断商品价格是否大于余额
    public MsgResult pay(String paytype,Double itemprice){
        if (querybalance(paytype)<itemprice){
            return new MsgResult(500,"支付失败","余额不足");
        }else {
            return new MsgResult(200,"支付成功","扣除金额"+itemprice);
        }
    }
}
