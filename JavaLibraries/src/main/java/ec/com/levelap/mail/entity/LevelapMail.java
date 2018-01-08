package ec.com.levelap.mail.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LevelapMail {
	
	private String from;

	private String subject;

	private String content;

	private List<String> recipentTO = new ArrayList<>();

	private List<String> recipentCC = new ArrayList<>();

	private List<String> recipentCCO = new ArrayList<>();
	
	private List<File> attachments = new ArrayList<>();

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getRecipentTO() {
		return recipentTO;
	}

	public void setRecipentTO(List<String> recipentTO) {
		this.recipentTO = recipentTO;
	}

	public List<String> getRecipentCC() {
		return recipentCC;
	}

	public void setRecipentCC(List<String> recipentCC) {
		this.recipentCC = recipentCC;
	}

	public List<String> getRecipentCCO() {
		return recipentCCO;
	}

	public void setRecipentCCO(List<String> recipentCCO) {
		this.recipentCCO = recipentCCO;
	}

	public List<File> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<File> attachments) {
		this.attachments = attachments;
	}
}
