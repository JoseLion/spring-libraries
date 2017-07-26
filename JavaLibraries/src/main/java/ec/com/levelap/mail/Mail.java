package ec.com.levelap.mail;

import java.util.Map;

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

	public void send(MailParameters param) throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		for (String address : param.getRecipentTO()) {
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(address));
		}
		for (String address : param.getRecipentCC()) {
			message.addRecipient(Message.RecipientType.CC, new InternetAddress(address));
		}
		for (String address : param.getRecipentCCO()) {
			message.addRecipient(Message.RecipientType.BCC, new InternetAddress(address));
		}
		message.setSubject(param.getSubject());
		message.setContent(param.getContent(), "text/html; charset=UTF-8");
		mailSender.send(message);
	}

	public String replaceParams(Map<String, String> params, String content) {
		for (Map.Entry<String, String> entry : params.entrySet()) {
			content = content.replace("{{" + entry.getKey() + "}}", entry.getValue());
		}
		return content;
	}
}
