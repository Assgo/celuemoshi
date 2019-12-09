package promotion;

/**
 * 团购优惠
 */
public class GroupBuyStragety implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("团购优惠");
    }
}
