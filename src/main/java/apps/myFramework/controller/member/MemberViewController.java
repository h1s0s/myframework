package apps.myFramework.controller.member;

import apps.myFramework.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @fileName : MemberViewController.java
 * @description : Member View Controller
 * @Author : SangSeonHan
 * @Date : 2024-03-08
 *
 * =====================================================
 *      Date    |       Auth        |    Description
 * =====================================================
 *   2024-03-08      SangSeonHan           최초생성
 */
@Controller
public class MemberViewController {

    @Autowired
    MemberService memberService;

    @GetMapping("/login")
    public String loginForm() {

        return "/view/badges/index.html";
    }
}
