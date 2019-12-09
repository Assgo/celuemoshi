package paymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付方式
 */
public class PayStrategy {
    private static final String ZHIFUBAO_PAY = "zhifubao";      //支付宝
    private static final String WEIXIN_PAY = "weixin";          //微信
    private static final String DEFAULT_PAY = ZHIFUBAO_PAY;     //默认:支付宝

    //定义集合存储支付方式
    private static Map<String, PayAccess> map = new HashMap<>();

    static {
        map.put(ZHIFUBAO_PAY, new Zhifubao());
        map.put(WEIXIN_PAY, new Weixin());
    }

    public static PayAccess get(String paytype) {
        //如果没有这个key，使用默认支付
        if (!map.containsKey(paytype)) {
            return map.get(DEFAULT_PAY);
        }
        return map.get(paytype);
    }
}
