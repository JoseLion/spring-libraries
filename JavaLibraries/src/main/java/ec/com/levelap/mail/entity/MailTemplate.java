package ec.com.levelap.mail.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.levelap.base.LevelapBase;
import ec.com.levelap.base.LevelapBaseContextHolder;

@Entity
@Table(schema="commons", name="mail_template", uniqueConstraints={@UniqueConstraint(columnNames={"code"}, name="code_uk")})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MailTemplate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id", nullable=false)
	protected Long id;

	@Column(nullable=false, columnDefinition="BOOLEAN DEFAULT TRUE")
	protected Boolean status = true;

	@Column(name="creation_date", nullable=false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	protected Date creationDate = new Date();

	@Column(name="creation_user", nullable=false, columnDefinition="BIGINT DEFAULT 0")
	protected Long creationUser = 0L;

	@Column(name="update_date")
	protected Date updateDate;

	@Column(name="update_user")
	protected Long updateUser;
	
	@Column(nullable=false, columnDefinition="VARCHAR")
	private String code;
	
	@Column(nullable=false, columnDefinition="VARCHAR")
	private String subject;
	
	@Column(nullable=false, columnDefinition="VARCHAR")
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(Long creationUser) {
		this.creationUser = creationUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	@PrePersist
	protected void onCreate() {
		LevelapBase levelap = LevelapBaseContextHolder.getContext().getBean(LevelapBase.class);
		try {
			this.setCreationUser(levelap.getConfig().getCurrentUser());
		} catch (Exception ex) {
			this.setCreationUser(-1L);
		}
	}

	@PreUpdate
	protected void onUpdate() {
		LevelapBase levelap = LevelapBaseContextHolder.getContext().getBean(LevelapBase.class);
		this.setUpdateDate(new Date());
		try {
			this.setUpdateUser(levelap.getConfig().getCurrentUser());
		} catch (Exception ex) {
			this.setUpdateUser(-1L);
		}
	}
}
