package lomayd.springstudy02.domain.discount;

import org.springframework.stereotype.Component;

import lomayd.springstudy02.domain.member.Grade;
import lomayd.springstudy02.domain.member.Member;
import lomayd.springstudy02.global.annotation.MainDiscountPolicy;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {

        if(member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }
        else {
            return 0;
        }
    }
}
