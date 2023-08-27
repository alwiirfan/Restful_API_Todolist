package api.todo.core.controllers;

import api.todo.core.dto.ResponseData;
import api.todo.core.dto.TodolistDTO;
import api.todo.core.models.entities.Todolist;
import api.todo.core.services.TodolistService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todolist")
public class TodolistController {

    @Autowired
    private TodolistService todolistService;

    public ResponseEntity<ResponseData<Todolist>> create(@Valid @RequestBody TodolistDTO todolistDTO, Errors errors){

        ResponseData<Todolist> responseData = new ResponseData<>();

        return ResponseEntity.ok(responseData);
    }

}
