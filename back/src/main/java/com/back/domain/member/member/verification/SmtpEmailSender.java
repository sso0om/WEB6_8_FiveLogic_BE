package com.back.domain.member.member.verification;

import com.back.domain.member.member.email.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Profile({"prod"})
@RequiredArgsConstructor
public class SmtpEmailSender implements EmailSender {

    private final EmailService emailService;

    @Override
    public void sendVerificationCode(String to, String code) {
        emailService.sendVerificationCode(to, code);
    }
}
