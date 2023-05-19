package lomayd.springstudy02.domain.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lomayd.springstudy02.domain.discount.DiscountPolicy;
import lomayd.springstudy02.domain.member.Member;
import lomayd.springstudy02.domain.member.repository.MemberRepository;
import lomayd.springstudy02.domain.order.Order;
import lomayd.springstudy02.global.annotation.MainDiscountPolicy;

@Component
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice){
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
    
    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
