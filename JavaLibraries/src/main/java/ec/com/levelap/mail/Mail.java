package ec.com.levelap.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Mail {

	@Autowired
	private JavaMailSender mailSender;

	public void send(String subject, String textMessage, String addressesTo) throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		message.setSubject(subject);
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addressesTo, false));
		message.setContent(textMessage, "text/html");
		mailSender.send(message);
	}
}
