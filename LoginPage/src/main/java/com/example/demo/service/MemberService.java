package com.example.demo.service;

import com.example.demo.entitiy.Member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public boolean findByMemberTable(String id){
        Member member = memberRepository.findById(id);
        if(member.equals(null)){
            return false;
        }
        return true;
    }
}
