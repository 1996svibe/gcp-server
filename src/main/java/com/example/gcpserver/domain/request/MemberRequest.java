package com.example.gcpserver.domain.request;

import com.example.gcpserver.domain.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequest {

    String name;
    String description;

    public Member toEntity(){
        return Member.builder().name(name).description(description).build();
    }

}