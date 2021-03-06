package cm.beni.main.julia.model.schema.access;
// Generated 2 ao�t 2020 02:32:19 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import cm.beni.main.julia.dao.controller.ObjectIdResolver;

/**
 * UserRoles generated by hbm2java
 */
@Entity
@Table(name = "user_roles", schema = "access", uniqueConstraints = @UniqueConstraint(columnNames = { "user", "role" }))
//@JsonIdentityInfo(generator = ObjectIdGenerators.UUIDGenerator.class, property = "@userRoles", scope = UserRoles.class, resolver = ObjectIdResolver.class)
@JsonIdentityInfo(generator=JSOGGenerator.class, resolver = ObjectIdResolver.class)
public class UserRoles implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identify;
	private String user;
	private String role;

	public UserRoles() {
	}

	public UserRoles(String identify, String user, String role) {
		this.identify = identify;
		this.user = user;
		this.role = role;
	}

	@Id

	@Column(name = "identify", unique = true, nullable = false, length = 64)
	public String getIdentify() {
		return this.identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	@Column(name = "[user]", nullable = false, length = 64)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "role", nullable = false, length = 64)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
