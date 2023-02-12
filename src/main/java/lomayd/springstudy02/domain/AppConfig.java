package lomayd.springstudy02.domain;

import lomayd.springstudy02.domain.discount.DiscountPolicy;
import lomayd.springstudy02.domain.discount.FixDiscountPolicy;
import lomayd.springstudy02.domain.member.repository.MemberRepository;
import lomayd.springstudy02.domain.member.repository.MemoryMemberRepository;
import lomayd.springstudy02.domain.member.service.MemberService;
import lomayd.springstudy02.domain.member.service.MemberServiceImpl;
import lomayd.springstudy02.domain.order.service.OrderService;
import lomayd.springstudy02.domain.order.service.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
