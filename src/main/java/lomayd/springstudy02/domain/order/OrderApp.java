package lomayd.springstudy02.domain.order;

import lomayd.springstudy02.domain.AppConfig;
import lomayd.springstudy02.domain.member.Grade;
import lomayd.springstudy02.domain.member.Member;
import lomayd.springstudy02.domain.member.service.MemberService;
import lomayd.springstudy02.domain.order.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
