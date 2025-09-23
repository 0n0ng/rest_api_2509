package com.example.demo.damain.member.dto.response;

import com.example.demo.damain.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class MemberResponse {
    private final String username;
    private final LocalDateTime createdDate;

    public MemberResponse(Member member) {
        this.username = member.getUsername();
        this.createdDate = member.getCreatedDate();
    }
}
