package com.example.gcpserver.controller;

import com.example.gcpserver.domain.entity.Member;
import com.example.gcpserver.domain.request.MemberRequest;
import com.example.gcpserver.service.GcpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:3000")
public class GcpController {
    private final GcpService gcpService;
    @PostMapping
    public void save(@RequestBody MemberRequest memberRequest){
        gcpService.save(memberRequest);
    }

    @GetMapping
    public List<Member> getAll(){
        return  gcpService.getAll();
    }
}
