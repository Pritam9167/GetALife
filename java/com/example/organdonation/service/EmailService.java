/*package com.example.organdonation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//service/EmailService.java
@Service
public class EmailService {

 @Autowired
 private JavaMailSender mailSender;

 public void sendConfirmation(String toEmail, String name) {
     SimpleMailMessage message = new SimpleMailMessage();
     message.setTo(toEmail);
     message.setSubject("Organ Donation Registration Confirmation");
     message.setText("Dear " + name + ",\n\nThank you for registering as an organ donor with GiftALife.\n\nTogether, we save lives! ❤️\n\n- GiftALife Team");
     message.setFrom("pritambarbateo9167@gmail.com");

     mailSender.send(message);
 }
}*/
