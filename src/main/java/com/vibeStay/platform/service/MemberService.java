package com.vibeStay.platform.service;

import com.vibeStay.platform.domain.MemberAuthDTO;
import com.vibeStay.platform.domain.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;

public interface MemberService {
    /** 회원 아이디로 정보 조회 */
    MemberDTO selectMemberById(String memberId);
    /** 회원 등록 */
    int insertMember(MemberDTO memberDTO);
    /** 로그인 */
    void login(MemberDTO memberDTO, HttpServletRequest request);
}
