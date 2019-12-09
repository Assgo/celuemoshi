package promotion;

public class Test {
    public static void main(String[] args) {
        String promotiontype=null;//自定义优惠
        PromotionActive promotionActive = new PromotionActive(new PromotionStrategyFactory().getPromotionStrategy(promotiontype));
        promotionActive.execute();//执行
    }
}
