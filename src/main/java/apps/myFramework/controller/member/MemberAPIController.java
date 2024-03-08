package apps.myFramework.controller.member;

import apps.myFramework.domain.member.MemberVO;
import apps.myFramework.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @fileName : MemberAPIController.java
 * @description : Member API Controller
 * @Author : SangSeonHan
 * @Date : 2024-03-08
 *
 * =====================================================
 *      Date    |       Auth        |    Description
 * =====================================================
 *   2024-03-08      SangSeonHan           최초생성
 */
@RestController("/member")
public class MemberAPIController {

    @Autowired
    MemberService memberService;

    @GetMapping
    private MemberVO getMember() {
        return null;
    }
}
