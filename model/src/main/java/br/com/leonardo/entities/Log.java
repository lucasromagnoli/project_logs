package br.com.leonardo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.leonardo.enums.LogType;

@Entity
public class Log {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String detail;
	private LogType type;
	
	@ManyToOne
	private ProjectVersion projectVersion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public LogType getType() {
		return type;
	}
	public void setType(LogType type) {
		this.type = type;
	}
	public ProjectVersion getProjectVersion() {
		return projectVersion;
	}
	public void setProjectVersion(ProjectVersion projectVersion) {
		this.projectVersion = projectVersion;
	}

}
