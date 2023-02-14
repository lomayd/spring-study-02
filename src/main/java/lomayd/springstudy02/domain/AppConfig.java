package lomayd.springstudy02.domain;

import lomayd.springstudy02.domain.discount.DiscountPolicy;
import lomayd.springstudy02.domain.discount.FixDiscountPolicy;
import lomayd.springstudy02.domain.member.repository.MemberRepository;
import lomayd.springstudy02.domain.member.repository.MemoryMemberRepository;
import lomayd.springstudy02.domain.member.service.MemberService;
import lomayd.springstudy02.domain.member.service.MemberServiceImpl;
import lomayd.springstudy02.domain.order.service.OrderService;
import lomayd.springstudy02.domain.order.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
