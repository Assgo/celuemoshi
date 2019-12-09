package paymethod;

public class MsgResult {
    private Integer scode;      //状态码
    private String state;       //支付状态（成功失败）
    private String msg;        //支付详情

    public MsgResult(Integer scode, String state, String msg) {
        this.scode = scode;
        this.state = state;
        this.msg = msg;
    }

    //打印支付情况
    @Override
    public String toString() {
        return "状态码：" + this.scode + "，交易详情：" + this.state + "，扣除金额：" + this.msg;
    }
}
