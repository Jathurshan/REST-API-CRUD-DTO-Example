package com.app.project.service;

import java.util.List;

import com.app.project.dto.ProjectQueryDTO;

public interface ProjectQueryService {

	public ProjectQueryDTO getProject(Integer id);

	public List<ProjectQueryDTO> getAllProjects();

}
