package promotion;

/**
 * 执行优惠的方式
 */
public class PromotionActive {
    //单例模式
    private PromotionStrategy promotionStrategy;
    public PromotionActive(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }
}
