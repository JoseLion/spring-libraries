package ec.com.levelap.mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailParameters {

	private String subject;

	private String content;

	private List<String> recipentTO = new ArrayList<>();

	private List<String> recipentCC = new ArrayList<>();

	private List<String> recipentCCO = new ArrayList<>();

	private Map<String, String> parameters = new HashMap<>();

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

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
}
