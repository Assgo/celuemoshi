package promotion;

/**
 * 优惠券
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("优惠券优惠");
    }
}
