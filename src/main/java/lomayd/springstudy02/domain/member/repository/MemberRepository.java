package lomayd.springstudy02.domain.member.repository;

import lomayd.springstudy02.domain.member.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
