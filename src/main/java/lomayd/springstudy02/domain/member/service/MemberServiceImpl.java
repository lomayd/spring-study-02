package lomayd.springstudy02.domain.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lomayd.springstudy02.domain.member.Member;
import lomayd.springstudy02.domain.member.repository.MemberRepository;

@Component
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
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
