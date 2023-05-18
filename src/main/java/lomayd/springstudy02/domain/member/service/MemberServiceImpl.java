package lomayd.springstudy02.domain.member.service;

import lomayd.springstudy02.domain.member.Member;
import lomayd.springstudy02.domain.member.repository.MemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member){memberRepository.save(member);}

    public Member findMember(Long memberId){return memberRepository.findById(memberId);}
    
    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
