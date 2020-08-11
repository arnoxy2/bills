package cm.beni.main.julia.model.schema.security;
// Generated 2 ao�t 2020 02:43:52 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import cm.beni.main.julia.dao.controller.ObjectIdResolver;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", schema = "security", uniqueConstraints = { @UniqueConstraint(columnNames = "code"),
		@UniqueConstraint(columnNames = "name") })
@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@role", scope = Role.class, resolver = ObjectIdResolver.class)
public class Role implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identify;
	private String code;
	private String name;
	private String label;

	public Role() {
	}

	public Role(String identify, String code, String name, String label) {
		this.identify = identify;
		this.code = code;
		this.name = name;
		this.label = label;
	}

	@Id

	@Column(name = "identify", unique = true, nullable = false, length = 64)
	public String getIdentify() {
		return this.identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	@Column(name = "code", unique = true, nullable = false, length = 100)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", unique = true, nullable = false, length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "label", nullable = false, length = 200)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
