package com.example.demo.repository;

import com.example.demo.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findById(String id);
//    public List<Member> findByAll();
}
