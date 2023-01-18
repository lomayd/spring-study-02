package lomayd.springstudy02.domain.member.service;

import lomayd.springstudy02.domain.member.Member;
import lomayd.springstudy02.domain.member.repository.MemberRepository;
import lomayd.springstudy02.domain.member.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public void join(Member member){
        memberRepository.save(member);
    }

    public Member findMember(Long memberId){
        return memberRepository.findById(memberId);
    }
}
