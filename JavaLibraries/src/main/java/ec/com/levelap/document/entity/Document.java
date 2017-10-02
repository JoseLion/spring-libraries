package ec.com.levelap.document.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@TypeDef(name="HStore", typeClass=HStoreUserType.class)
@Table(schema="commons", name="document", uniqueConstraints={@UniqueConstraint(columnNames={"code"}, name="code_uk")})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Document extends BaseEntity {
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String name;
	
	@Column(columnDefinition="VARCHAR")
	private String code;
	
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String mimeType;
	
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String route;
	
	@Column(name="meta_data", columnDefinition="HStore")
	private Map<String, String> metaData = new HashMap<>();
	
	@Column(name="content_manager_id", columnDefinition="VARCHAR")
	private String contentManagerId;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH)
	@JoinColumn(name="type", foreignKey=@ForeignKey(name="document_type_fk"))
	private DocumentType type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Map<String, String> getMetaData() {
		return metaData;
	}

	public void setMetaData(Map<String, String> metaData) {
		this.metaData = metaData;
	}

	public String getContentManagerId() {
		return contentManagerId;
	}

	public void setContentManagerId(String contentManagerId) {
		this.contentManagerId = contentManagerId;
	}

	public DocumentType getType() {
		return type;
	}

	public void setType(DocumentType type) {
		this.type = type;
	}
}
