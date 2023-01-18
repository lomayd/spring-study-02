package lomayd.springstudy02.domain.member.service;

import lomayd.springstudy02.domain.member.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
