package com.app.project.service;

import com.app.project.dto.ProjectCreateDTO;
import com.app.project.dto.ProjectQueryDTO;
import com.app.project.dto.ProjectUpdateDTO;

public interface ProjectCommandService {
	public Integer createProject(ProjectCreateDTO projectCreateDTO);

	public ProjectQueryDTO updateProject(Integer id, ProjectUpdateDTO projectUpdateDTO);

	public void deleteProject(Integer id);
}
