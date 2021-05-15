package com.async;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringbootAsyncApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads1() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("郑超测试邮件");
        message.setText("测试测试");
        message.setTo("1658955813@qq.com");
        message.setFrom("1658955813@qq.com");
        mailSender.send(message);
    }

    @Test
    void contextLoads2() throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true);
        mimeMessageHelper.setSubject("郑超测试邮件");
        mimeMessageHelper.setText("<p>测试测试</p>", true);// 支持解析html
        mimeMessageHelper.addAttachment("ads.avi", new File(""));// 上传附件
        mimeMessageHelper.setTo("1658955813@qq.com");
        mimeMessageHelper.setFrom("1658955813@qq.com");
        mailSender.send(message);
    }

}
