package lomayd.springstudy02.domain.order.service;

import lomayd.springstudy02.domain.discount.DiscountPolicy;
import lomayd.springstudy02.domain.discount.FixDiscountPolicy;
import lomayd.springstudy02.domain.member.Member;
import lomayd.springstudy02.domain.member.repository.MemberRepository;
import lomayd.springstudy02.domain.member.repository.MemoryMemberRepository;
import lomayd.springstudy02.domain.order.Order;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice){
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
