package com.app.project.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.project.dto.ProjectQueryDTO;
import com.app.project.entity.Project;
import com.app.project.repository.ProjectRepository;
import com.app.project.service.ProjectQueryService;

@Service
public class ProjectQueryServiceImpl implements ProjectQueryService {

	@Autowired
	private ProjectRepository projectRepo;

	@Override
	public ProjectQueryDTO getProject(Integer id) {
		if (projectRepo.findById(id).isPresent()) {
			Project fetchProject = projectRepo.findById(id).get();
			return new ProjectQueryDTO(fetchProject.getId(), fetchProject.getName(), fetchProject.getDescription(),
					fetchProject.getAgentName());
		} else {
			return null;
		}
	}

	@Override
	public List<ProjectQueryDTO> getAllProjects() {
		List<ProjectQueryDTO> projectList = new ArrayList<>();
		projectRepo.findAll().forEach(project -> {
			projectList.add(new ProjectQueryDTO(project.getId(), project.getName(), project.getDescription(),
					project.getAgentName()));
		});

		return projectList;
	}

}
