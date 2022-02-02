package com.bpofashion.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.bpofashion.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
