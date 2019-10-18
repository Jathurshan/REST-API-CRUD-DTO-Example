package com.app.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.project.dto.ProjectCreateDTO;
import com.app.project.dto.ProjectQueryDTO;
import com.app.project.dto.ProjectUpdateDTO;
import com.app.project.service.ProjectCommandService;

@RestController
@RequestMapping("/api/project")
public class ProjectCommandController {

	@Autowired
	private ProjectCommandService projectCommandService;

	@PostMapping
	public ResponseEntity<Integer> createProject(@RequestBody ProjectCreateDTO projectCreateDTO) {
		return new ResponseEntity<>(projectCommandService.createProject(projectCreateDTO), HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ProjectQueryDTO> updateProject(@PathVariable("id") Integer id,
			@RequestBody ProjectUpdateDTO projectUpdateDTO) {
		return new ResponseEntity<>(projectCommandService.updateProject(id, projectUpdateDTO), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteProject(@PathVariable("id") Integer id) {
		projectCommandService.deleteProject(id);
	}
}
