package com.back.domain.member.member.verification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Profile({"dev", "local", "test"})
public class LogEmailSender implements EmailSender {

    @Override
    public void sendVerificationCode(String to, String code) {
        log.info("[DEV] email={}, verificationCode={}", to, code);
    }
}
