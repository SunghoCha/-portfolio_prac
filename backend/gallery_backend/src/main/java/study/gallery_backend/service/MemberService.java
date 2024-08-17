package study.gallery_backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.gallery_backend.domain.Member;
import study.gallery_backend.dto.LoginRequest;
import study.gallery_backend.repository.MemberRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member findByEmailAndPassword(LoginRequest request) {
        return memberRepository.findByEmailAndPassword(request.getEmail(), request.getPassword()).orElseThrow(IllegalArgumentException::new);
    }
}
