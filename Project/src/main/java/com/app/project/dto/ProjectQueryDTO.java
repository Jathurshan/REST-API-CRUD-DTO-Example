package com.app.project.dto;

public class ProjectQueryDTO {

	private int id;
	private String name;
	private String description;
	private String agentName;

	public ProjectQueryDTO(int id, String name, String description, String agentName) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.agentName = agentName;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getAgentName() {
		return agentName;
	}

	@Override
	public String toString() {
		return "ProjectQueryDTO [id=" + id + ", name=" + name + ", description=" + description + ", agentName="
				+ agentName + "]";
	}

}
