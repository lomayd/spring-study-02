package lomayd.springstudy02.domain.discount;

import lomayd.springstudy02.domain.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
