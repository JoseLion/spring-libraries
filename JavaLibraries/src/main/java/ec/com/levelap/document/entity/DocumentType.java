package ec.com.levelap.document.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(schema="commons", name="document_type", uniqueConstraints={@UniqueConstraint(columnNames={"code"}, name="code_uk")})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DocumentType extends BaseEntity {
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String name;
	
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String code;
	
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String root;
	
	@Column(name="meta_keys", columnDefinition="text[]", nullable=false)
	private String[] metaKeys;
	
	@Column(columnDefinition="INTEGER DEFAULT -1", nullable=false)
	private Integer quantity = -1;
	
	@Column(name="group_code", columnDefinition="VARCHAR", nullable=false)
	private String groupCode;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.DETACH)
	@JoinColumn(name="category", foreignKey=@ForeignKey(name="document_category_fk"))
	private DocumentCategory category;

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

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public String[] getMetaKeys() {
		return metaKeys;
	}

	public void setMetaKeys(String[] metaKeys) {
		this.metaKeys = metaKeys;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public DocumentCategory getCategory() {
		return category;
	}

	public void setCategory(DocumentCategory category) {
		this.category = category;
	}
}
