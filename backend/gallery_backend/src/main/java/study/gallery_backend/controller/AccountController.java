package study.gallery_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.gallery_backend.repository.MemberRepository;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final MemberRepository memberRepository;

    @PostMapping("/api/account/login")
    public int login() {

        return 0;
    }

}
