package lomayd.springstudy02.domain.order.service;

import lomayd.springstudy02.domain.member.Grade;
import lomayd.springstudy02.domain.member.Member;
import lomayd.springstudy02.domain.member.service.MemberService;
import lomayd.springstudy02.domain.member.service.MemberServiceImpl;
import lomayd.springstudy02.domain.order.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
