package ec.com.levelap.mail.service;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import ec.com.levelap.mail.entity.LevelapMail;

@Component
public class MailHelper {

	@Autowired
	private JavaMailSender mailSender;

	public void send(LevelapMail levelapMail) throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true, StandardCharsets.UTF_8.name());
		
		List<InternetAddress> toList = new ArrayList<>();
		for (String address : levelapMail.getRecipentTO()) {
			toList.add(new InternetAddress(address));
		}
		helper.setTo(toList.toArray(new InternetAddress[0]));
		
		List<InternetAddress> ccList = new ArrayList<>();
		for (String address : levelapMail.getRecipentCC()) {
			ccList.add(new InternetAddress(address));
		}
		helper.setCc(ccList.toArray(new InternetAddress[0]));
		
		List<InternetAddress> bccList = new ArrayList<>();
		for (String address : levelapMail.getRecipentCCO()) {
			bccList.add(new InternetAddress(address));
		}
		helper.setBcc(bccList.toArray(new InternetAddress[0]));
		
		for (File file : levelapMail.getAttachments()) {
			helper.addAttachment(file.getName(), file);
		}
		
		helper.setSubject(levelapMail.getSubject());
		helper.setText(levelapMail.getContent(), true);
		
		if (levelapMail.getFrom() != null && !levelapMail.getFrom().isEmpty()) {
			helper.setFrom(new InternetAddress(levelapMail.getFrom()));
		}
		
		mailSender.send(message);
	}

	public String replaceParams(Map<String, String> params, String content) {
		for (Map.Entry<String, String> entry : params.entrySet()) {
			content = content.replace("{{" + entry.getKey() + "}}", entry.getValue());
		}
		return content;
	}
}
