package promotion;

/**
 * 打折
 */
public class CashBackStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("打折优惠");
    }
}
