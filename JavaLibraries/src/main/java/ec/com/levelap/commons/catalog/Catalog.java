package ec.com.levelap.commons.catalog;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.entity.BaseEntity;

@Entity
@Table(schema="commons", name="catalog", uniqueConstraints=@UniqueConstraint(columnNames="code", name="code_uk"))
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Catalog extends BaseEntity {
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String name;
	
	@Column(columnDefinition="VARCHAR", nullable=false)
	private String code;
	
	@Column(columnDefinition="VARCHAR")
	private String other;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="parent", foreignKey=@ForeignKey(name="parent_catalog_fk"))
	private Catalog parent;
	
	@OneToMany(mappedBy="parent", fetch=FetchType.LAZY)
	private List<Catalog> children = new ArrayList<>();
	
	@Transient
	private Integer level = 0;

	public Catalog() {
		super();
	}

	public Catalog(String name, String code, String other) {
		super();
		this.name = name;
		this.code = code;
		this.other = other;
	}

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

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Catalog getParent() {
		if (this.parent != null) {
			this.parent.setChildren(new ArrayList<>());
		}
		
		return this.parent;
	}

	public void setParent(Catalog parent) {
		this.parent = parent;
	}

	public List<Catalog> getChildren() {
		return children;
	}

	public void setChildren(List<Catalog> children) {
		this.children = children;
	}

	public Integer getLevel() {
		this.level = 0;
		Catalog currentParent = this.parent;
		
		while (currentParent != null) {
			this.level++;
			currentParent = currentParent.getParent();
		}
		
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
}
