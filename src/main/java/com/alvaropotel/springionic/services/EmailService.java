package com.alvaropotel.springionic.services;

import org.springframework.mail.SimpleMailMessage;

import com.alvaropotel.springionic.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
}
