package cm.beni.main.julia.model.schema.monitoring;
// Generated 2 ao�t 2020 02:40:42 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import cm.beni.main.julia.dao.controller.ObjectIdResolver;

/**
 * Log generated by hbm2java
 */
@Entity
@Table(name = "log", schema = "monitoring")
@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@log", scope = Log.class, resolver = ObjectIdResolver.class)
public class Log implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identify;
	private Monitor monitor;
	private String backupQuery;
	private String executeQuery;
	private String status;
	private String exception;

	public Log() {
	}

	public Log(String identify, Monitor monitor) {
		this.identify = identify;
		this.monitor = monitor;
	}

	public Log(String identify, Monitor monitor, String backupQuery, String executeQuery, String status,
			String exception) {
		this.identify = identify;
		this.monitor = monitor;
		this.backupQuery = backupQuery;
		this.executeQuery = executeQuery;
		this.status = status;
		this.exception = exception;
	}

	@Id

	@Column(name = "identify", unique = true, nullable = false, length = 64)
	public String getIdentify() {
		return this.identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "monitor", nullable = false)
	public Monitor getMonitor() {
		return this.monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	@Column(name = "backup_query")
	public String getBackupQuery() {
		return this.backupQuery;
	}

	public void setBackupQuery(String backupQuery) {
		this.backupQuery = backupQuery;
	}

	@Column(name = "execute_query")
	public String getExecuteQuery() {
		return this.executeQuery;
	}

	public void setExecuteQuery(String executeQuery) {
		this.executeQuery = executeQuery;
	}

	@Column(name = "status", length = 100)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "exception")
	public String getException() {
		return this.exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

}
