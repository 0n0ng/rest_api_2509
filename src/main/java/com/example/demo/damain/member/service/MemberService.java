package com.example.demo.damain.member.service;

import com.example.demo.damain.member.entity.Member;
import com.example.demo.damain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member join(String username, String password) {
        Member checkedMember = memberRepository.findByUsername(username);

        if (checkedMember != null) {
            throw new RuntimeException("이미 가입된 사용자입니다.");
        }
        Member member = Member.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .build();

        memberRepository.save(member);

        return member;
    }
}
