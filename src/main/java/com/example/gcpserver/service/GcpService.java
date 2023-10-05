package com.example.gcpserver.service;


import com.example.gcpserver.domain.entity.Member;
import com.example.gcpserver.domain.request.MemberRequest;
import com.example.gcpserver.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GcpService {

    private final MemberRepository memberRepository;

    public void save(MemberRequest memberRequest){
        Member member = memberRequest.toEntity();
        memberRepository.save(member);
    }

    public List<Member> getAll(){
        return memberRepository.findAll();
    }
}