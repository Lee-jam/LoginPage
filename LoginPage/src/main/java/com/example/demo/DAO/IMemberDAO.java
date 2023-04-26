package com.example.demo.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.DTO.MemberDTO;

@Mapper
public interface IMemberDAO {
	//회원 조회
	public List<MemberDTO> searchMember(@Param("_id") String id);
	//회원 가입
	public int insertMember(MemberDTO dto);
	//회원 탈퇴
	public int deleteMember(MemberDTO dto);
	//비밀번호 수정
	public int updatePass(MemberDTO dto);
}
