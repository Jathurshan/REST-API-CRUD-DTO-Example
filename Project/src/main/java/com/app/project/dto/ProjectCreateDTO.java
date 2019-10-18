package com.app.project.dto;

public class ProjectCreateDTO {

	private String name;
	private String description;
	private String agentName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Override
	public String toString() {
		return "ProjectCreateDTO [name=" + name + ", description=" + description + ", agentName=" + agentName + "]";
	}

}
