package ec.com.levelap.mail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.levelap.mail.entity.MailTemplate;

@Repository
public interface MailTemplateRepo extends JpaRepository<MailTemplate, Long> {
	public MailTemplate findByCode(String code);
}
