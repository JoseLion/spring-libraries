package ec.com.levelap.base.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(insertable = false, updatable = false, nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
	protected Boolean status = true;

	@Column(name = "creation_date", insertable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	protected Date creationDate = new Date();

	@Column(name = "creation_user", insertable = false, columnDefinition = "BIGINT DEFAULT 0")
	protected Long creationUser = 0L;

	@Column(name = "update_date", updatable = false)
	protected Date updateDate;

	@Column(name = "update_user", updatable = false)
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
		// Authentication ath =
		// SecurityContextHolder.getContext().getAuthentication();
		// User usuario = (User) ath.getPrincipal();
		// System.out.println(usuario.getId());
	}

	@PreUpdate
	protected void onUpdate() {
		this.updateDate = new Date();
		// Actualización del usuario conectado.
	}
}
