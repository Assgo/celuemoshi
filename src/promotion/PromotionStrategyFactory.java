package promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    //定义优惠方式map集合
    private static Map<PromotionType, PromotionStrategy> promotionStrategyMap = new HashMap<>();

    static {
        promotionStrategyMap.put(PromotionType.CashBack,new CashBackStrategy());
        promotionStrategyMap.put(PromotionType.Coupon,new CouponStrategy());
        promotionStrategyMap.put(PromotionType.GroupBuy,new GroupBuyStragety());
    }
    //定义无优惠
    private final PromotionStrategy NO_Promotion=new EmptyStrategy();

    //获取优惠策略
    public PromotionStrategy getPromotionStrategy(String promotionType){
        if(!promotionStrategyMap.containsKey(promotionType)){
            return NO_Promotion;
        }else {
            return promotionStrategyMap.get(promotionType);
        }
    }
}
//枚举类型，用于添加优惠方式
enum PromotionType {
    CashBack, Coupon, GroupBuy
}
