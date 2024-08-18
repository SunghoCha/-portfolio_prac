package study.gallery_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.gallery_backend.domain.Member;
import study.gallery_backend.dto.LoginRequest;
import study.gallery_backend.service.MemberService;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/api/account/login")
    public ResponseEntity<Long> login(LoginRequest request) {
        Member member = memberService.findByEmailAndPassword(request);

        return ResponseEntity.ok().body(member.getId());
    }
}
