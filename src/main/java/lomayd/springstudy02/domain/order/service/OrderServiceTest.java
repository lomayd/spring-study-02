package lomayd.springstudy02.domain.order.service;

import org.junit.jupiter.api.BeforeEach;

import lomayd.springstudy02.domain.AppConfig;
import lomayd.springstudy02.domain.member.service.MemberService;


class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;
    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }
}
