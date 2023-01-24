package lomayd.springstudy02.domain;

import lomayd.springstudy02.domain.discount.FixDiscountPolicy;
import lomayd.springstudy02.domain.member.repository.MemoryMemberRepository;
import lomayd.springstudy02.domain.member.service.MemberService;
import lomayd.springstudy02.domain.member.service.MemberServiceImpl;
import lomayd.springstudy02.domain.order.service.OrderService;
import lomayd.springstudy02.domain.order.service.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
