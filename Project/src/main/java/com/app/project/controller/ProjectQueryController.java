package com.app.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.project.dto.ProjectQueryDTO;
import com.app.project.service.ProjectQueryService;

@RestController
@RequestMapping("/api/project")
public class ProjectQueryController {

	@Autowired
	private ProjectQueryService projectQueryService;

	@GetMapping
	public ResponseEntity<List<ProjectQueryDTO>> getAllProjects() {
		return new ResponseEntity<>(projectQueryService.getAllProjects(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProjectQueryDTO> getProjectById(@PathVariable("id") Integer id){
		return new ResponseEntity<ProjectQueryDTO>(projectQueryService.getProject(id),HttpStatus.OK);
	}
}
