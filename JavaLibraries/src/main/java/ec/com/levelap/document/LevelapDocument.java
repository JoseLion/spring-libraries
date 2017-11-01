package ec.com.levelap.document;

import org.springframework.stereotype.Service;

@Service
public class LevelapDocument {
	private DocumentConfig documentConfig;

	public LevelapDocument(DocumentConfig documentConfig) {
		super();
		this.documentConfig = documentConfig;
	}

	public DocumentConfig getDocumentConfig() {
		return documentConfig;
	}

	public void setDocumentConfig(DocumentConfig documentConfig) {
		this.documentConfig = documentConfig;
	}
}
