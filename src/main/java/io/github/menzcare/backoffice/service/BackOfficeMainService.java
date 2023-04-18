package io.github.menzcare.backoffice.service;

import io.github.menzcare.backoffice.domain.Member;
import io.github.menzcare.backoffice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BackOfficeMainService {
  private final MemberRepository memberRepository;
  
  public String testService() {
    System.out.println("testService");
    return "test";
  }
  
  public String saveMember() {
    Member member = Member.builder()
        .name("TestName")
        .email("test@gmail.com")
        .build();
    memberRepository.save(member);
    return "save";
  }
}
