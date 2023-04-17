package lomayd.springstudy02.domain.member.service;

import org.junit.jupiter.api.BeforeEach;

import lomayd.springstudy02.domain.AppConfig;

class MemberServiceTest {

    MemberService memberService;
    
    @BeforeEach
    public void beforeEach() {
     AppConfig appConfig = new AppConfig();
     memberService = appConfig.memberService();
    }
}
