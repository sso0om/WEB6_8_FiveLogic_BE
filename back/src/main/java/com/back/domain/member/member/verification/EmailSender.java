package com.back.domain.member.member.verification;

public interface EmailSender {
    void sendVerificationCode(String to, String code);
}
