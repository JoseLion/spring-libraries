package ec.com.levelap.mail.service;

import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.levelap.mail.entity.LevelapMail;
import ec.com.levelap.mail.entity.MailTemplate;
import ec.com.levelap.mail.repository.MailTemplateRepo;

@Service
public class MailService {
	@Autowired
	private MailTemplateRepo mailTemplateRepo;
	
	@Autowired
	private MailHelper mailHelper;
	
	public Boolean sendMailWihTemplate(LevelapMail levelapMail, String template, Map<String, String> params) throws MessagingException {
		MailTemplate mail = mailTemplateRepo.findByCode(template);
		
		if (mail != null) {
			String content = mailHelper.replaceParams(params, mail.getContent());
			levelapMail.setSubject(mail.getSubject());
			levelapMail.setContent(content);
			mailHelper.send(levelapMail);
			
			return true;
		}
		
		return false;
	}
	
	public Boolean sendMail(LevelapMail levelapMail) throws MessagingException {
		mailHelper.send(levelapMail);
		return true;
	}
}
