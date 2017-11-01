package ec.com.levelap.document.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import ec.com.levelap.document.LevelapContextHolder;
import ec.com.levelap.document.LevelapDocument;

@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
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

	@PrePersist
	protected void onCreate() {
		try {
			LevelapDocument levelapDocument = LevelapContextHolder.getContext().getBean(LevelapDocument.class);
			this.setCreationUser(levelapDocument.getDocumentConfig().currentUserId());
		} catch (Exception ex) {
			this.setCreationUser(-1L);
		}
	}

	@PreUpdate
	protected void onUpdate() {
		this.setUpdateDate(new Date());
		
		try {
			LevelapDocument levelapDocument = LevelapContextHolder.getContext().getBean(LevelapDocument.class);
			this.setUpdateUser(levelapDocument.getDocumentConfig().currentUserId());
		} catch (Exception ex) {
			this.setUpdateUser(-1L);
		}
	}
}
