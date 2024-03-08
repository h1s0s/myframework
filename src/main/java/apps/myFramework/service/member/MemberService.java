package apps.myFramework.service.member;

import apps.myFramework.domain.member.MemberVO;
import org.springframework.stereotype.Service;


/**
 * @fileName : MemberService.java
 * @description : Member Service 인터페이스
 * @Author : SangSeonHan
 * @Date : 2024-03-08
 *
 * =====================================================
 *      Date    |       Auth        |    Description
 * =====================================================
 *   2024-03-08      SangSeonHan           최초생성
 */
public interface MemberService {

    MemberVO getMember() throws Exception;
}
